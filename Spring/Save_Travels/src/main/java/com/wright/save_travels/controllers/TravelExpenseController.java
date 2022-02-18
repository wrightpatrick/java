package com.wright.save_travels.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.wright.save_travels.models.TravelExpense;
import com.wright.save_travels.services.TravelExpenseService;

@Controller
public class TravelExpenseController {

	private final TravelExpenseService travelExpenseService;

	public TravelExpenseController(TravelExpenseService travelExpenseService) {
		this.travelExpenseService = travelExpenseService;
	}

	//homepage
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

	//view one expense
	@GetMapping("/expense/view")
	public String home() {
		return "dashboard.jsp";
	}
}
