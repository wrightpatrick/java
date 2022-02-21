package com.wright.save_travels.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.wright.save_travels.models.TravelExpense;
import com.wright.save_travels.services.TravelExpenseService;

@Controller
public class TravelExpenseController {

	private final TravelExpenseService travelExpenseService;

	public TravelExpenseController(TravelExpenseService travelExpenseService) {
		this.travelExpenseService = travelExpenseService;
	}

	//home page
	@GetMapping("/")
	public String index(Model model) {
		List<TravelExpense> allTravelExpenses = travelExpenseService.allTravelExpenses();
		model.addAttribute("allTravelExpenses", allTravelExpenses);
		model.addAttribute("travelExpense", new TravelExpense());
		return "index.jsp";
	}

	//create new expense
	@PostMapping("/expense/create")
	public String create(@Valid @ModelAttribute("travelExpense") TravelExpense travelExpense, BindingResult result) {
		if (result.hasErrors()) {
			return "index.jsp";
		} else {
			travelExpenseService.createTravelExpense(travelExpense);
			return "redirect:/";
		}
	}

	//view one expense to edit
	@GetMapping("/expense/edit/{id}")
	public String edit(@PathVariable("id") Long id, Model model) {
		TravelExpense editTravelExpense = this.travelExpenseService.findExpense(id);
		model.addAttribute("editTravelExpense", editTravelExpense);
		return "edit.jsp";
	}
	
	//edit one expense
	@PutMapping("/expense/update/{id}")
	public String update(@PathVariable("id") Long id, @Valid @ModelAttribute("editTravelExpense") TravelExpense editTravelExpense, BindingResult result, Model model) {
		if (result.hasErrors()) {
			
			return "edit.jsp";
		} else {
			travelExpenseService.updateExpense(editTravelExpense);
			return "redirect:/";
		}
	}
	
	//delete one expense
	@GetMapping("/expense/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		this.travelExpenseService.deleteExpense(id);
		return "redirect:/";
	}
	
	//view one expense
		@GetMapping("/expense/view/{id}")
		public String view(@PathVariable("id") Long id, Model model) {
			TravelExpense viewTravelExpense = this.travelExpenseService.findExpense(id);
			model.addAttribute("viewTravelExpense", viewTravelExpense);
			return "dashboard.jsp";
		}
}
