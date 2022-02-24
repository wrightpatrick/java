package com.wright.dojos_and_ninjas.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.wright.dojos_and_ninjas.models.Ninja;
import com.wright.dojos_and_ninjas.services.DojoService;
import com.wright.dojos_and_ninjas.services.NinjaService;

@Controller
public class NinjaController {
	@Autowired
	NinjaService ninjaService;
	@Autowired
	DojoService dojoService;

	
	//view create page
	@GetMapping("/ninjas/new")
	public String ninja(@ModelAttribute("ninja")Ninja ninja, Model model) {
		model.addAttribute("allDojos", dojoService.allDojos());
		
		return "newNinja.jsp";
	}
	// create one ninja
	@PostMapping("/ninjas/create")
	public String newNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("allDojos", dojoService.allDojos());
			return "newNinja.jsp";
		} else {
		ninjaService.createNinja(ninja);
		
		return "redirect:/ninjas/new";
		}
	}
}
