package com.wright.dojos_and_ninjas.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.wright.dojos_and_ninjas.models.Dojo;
import com.wright.dojos_and_ninjas.services.DojoService;
import com.wright.dojos_and_ninjas.services.NinjaService;

@Controller
public class DojoController {
	@Autowired
	DojoService dojoService;
	@Autowired
	NinjaService ninjaService;
	
	//landing page
	@GetMapping("/")
	public String index(@ModelAttribute("dojo")Dojo dojo) {
		return "index.jsp";
		
	}
	
	//create new dojo
	@PostMapping("/dojo/new") 
		public String newDojo(@Valid @ModelAttribute("dojo")Dojo dojo, BindingResult result, Model model) {
			Dojo oneDojo = dojoService.createDojo(dojo);
			
			model.addAttribute("oneDojo", oneDojo);
			return "redirect:/";
	}
	
	//view one dojo
	@GetMapping("/dojo/{id}")
		public String show(@PathVariable("id")Long id, Model model) {
			
			Dojo oneDojo = dojoService.getOneDojoById(id);
			model.addAttribute("oneDojo", oneDojo);
			
			return "dojoView.jsp";
	}
	
	
}
