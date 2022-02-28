package com.wright.login.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.wright.login.models.User;
import com.wright.login.services.UserService;
import com.wright.login.validations.LoginUser;

@Controller
public class HomeController {

	
    @Autowired
    private UserService userServ;
    
    @GetMapping("/")
    public String index(Model model) {
    
        // Bind empty User and LoginUser objects to the JSP
        // to capture the form input
        model.addAttribute("newUser", new User());
        model.addAttribute("newLogin", new LoginUser());
        return "index.jsp";
    }
    
    @PostMapping("/register")
    public String register(@Valid @ModelAttribute("newUser") User newUser, 
            BindingResult result, Model model, HttpSession session) {
        
        User user = this.userServ.register(newUser, result);
        
        if(result.hasErrors()) {
            // Be sure to send in the empty LoginUser before 
            // re-rendering the page.
            model.addAttribute("newLogin", new LoginUser());
            return "index.jsp";
        }
        
        // No errors! 
        session.setAttribute("loggedInUserId", user.getId());
    
        return "redirect:/home";
    }
    
    @PostMapping("/login")
    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
            BindingResult result, Model model, HttpSession session) {
        
        User user = userServ.login(newLogin, result);
    
        if(result.hasErrors()) {
            model.addAttribute("newUser", new User());
            return "index.jsp";
        }
    
        // No errors! 
        session.setAttribute("loggedInUserId", user.getId());
    
        return "redirect:/home";
    }
    
    @GetMapping("/home")
    public String home(HttpSession session, Model model) {
    	//give the ID of user in session
    	Long id = (Long) session.getAttribute("loggedInUserId");
    	
    	if(id == null) {
    		return "redirect:/";
    	}
    	
    	User loggedInUser = this.userServ.findOneUser(id);
    	
    	model.addAttribute("loggedInUser", loggedInUser);
    	
    	return "dashboard.jsp";
    }
    
    //logout user by clearing session and returning to login/registration page
    @GetMapping("/logout")
    public String logOut(HttpSession session) {
    	session.invalidate();
    	
    	return "redirect:/";
    }
    
}

