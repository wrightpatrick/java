package com.wright.omikuji_form;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home(HttpSession session) {
		

		return "omikujiForm.jsp";
	}

	@PostMapping("/formPost")
	public String formPost(HttpSession session, @RequestParam(value = "pickNumber") int pickNumber,
			@RequestParam(value = "cityName") String cityName, @RequestParam(value = "personName") String personName,
			@RequestParam(value = "tradeHobby") String tradeHobby, @RequestParam(value = "livingThing") String livingThing,
			@RequestParam(value = "somethingNice") String somethingNice) {
		session.setAttribute("pickNumber", pickNumber);
		session.setAttribute("cityName", cityName);
		session.setAttribute("personName", personName);
		session.setAttribute("tradeHobby", tradeHobby);
		session.setAttribute("livingThing", livingThing);
		session.setAttribute("somethingNice", somethingNice);

		return "redirect:/results";
	}

	@RequestMapping("/results")
	public String results() {
		
		return "results.jsp";
	}
}
