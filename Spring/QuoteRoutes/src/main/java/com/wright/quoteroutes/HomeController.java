package com.wright.quoteroutes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController //this tells the app that we can accept and send out responses

//@RequestMapping("/quotes")
public class HomeController {
	
	
	
	
	@RequestMapping("/")
	public String home() {
		return "Hello world. Welcome to the home application";
	}
	
	@RequestMapping("/dashboard")
	public String dashboard(@RequestParam(value="name") String queryparam) {
		System.out.println("this is the query param value " + queryparam);
		return "Welcome to the dashboard " + queryparam;
	}
	
	
}
