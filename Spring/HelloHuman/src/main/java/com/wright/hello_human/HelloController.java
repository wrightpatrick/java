package com.wright.hello_human;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/")
    public String index(@RequestParam(value="q", required=false) String searchQuery, @RequestParam(value="a", required=false) String age) {
        if (searchQuery ==null) {
        	return "Hello Human";
        } else {
        	return "Hello " + searchQuery + " Age: " + age;        	
        }
        
	}
}
