package com.wright.daikichi_routes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DaikichiController {
	
	
	@RequestMapping("/")
	public String home() {
		return "Hello my Valentine";
	}
 
	@RequestMapping("/Daikichi")
	public String Dashboard() {
		return "Welcome";
	}
	
	@RequestMapping("/Daikichi/today")
	public String fortune() {
		return "Today you will find luck in all your endeavors";
	}
	
	@RequestMapping("/Daikichi/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
}
