package com.wright.daikichi_routes;

import org.springframework.web.bind.annotation.PathVariable;
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

	@RequestMapping("/Daikichi/travel/{location}")
	public String travel(@PathVariable("location") String location) {
		return "Congratulations! You will soon travel to " + location;
	}

	@RequestMapping("/Daikichi/lotto/{number}")
	public String lotto(@PathVariable("number") Integer number) {
		if (number % 2 == 0) {
			return "You will take a grand journey in the near future, but be wary of temping offers";
		} else
			return "You have enjoyed the fruits of your labor but now is a  great time to spend time with family and friends.";

	}
}
