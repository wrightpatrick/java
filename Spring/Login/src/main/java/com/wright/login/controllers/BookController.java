package com.wright.login.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.wright.login.models.Book;
import com.wright.login.services.BookService;

@Controller
public class BookController {

	@Autowired
	BookService bookServ;

	
	@GetMapping("/books/create")
	public String newBook(@ModelAttribute("newBook") Book newBook, HttpSession session, Model model) {
		Long idOfLoggedInUser = (Long)session.getAttribute("loggedInUserId");
		model.addAttribute("idOfLoggedInUser", idOfLoggedInUser);
		return "book.jsp";
	}

	@PostMapping("/create")
	public String create(@Valid @ModelAttribute("newBook") Book newBook, BindingResult result) {
		if(result.hasErrors()) {
			return "book.jsp";
		} else {
			
			bookServ.create(newBook);
			return "redirect:/home";
		}

	}
	
	// view one book's details
	@GetMapping("/books/{id}")
	public String viewOne(Model model, @PathVariable("id") Long id, HttpSession session) {
		Book book = bookServ.findBook(id);
		model.addAttribute(book);
		Long idOfLoggedInUser = (Long)session.getAttribute("loggedInUserId");
		model.addAttribute("idOfLoggedInUser", idOfLoggedInUser);
		return "oneBook.jsp";
	}
	
	// render edit page
	@GetMapping("/books/{id}/edit")
	public String editOne(@ModelAttribute("book") Book update, Model model, @PathVariable("id") Long id, HttpSession session) {
		Book book = bookServ.findBook(id);
		model.addAttribute(book);
		Long idOfLoggedInUser = (Long)session.getAttribute("loggedInUserId");
		model.addAttribute("idOfLoggedInUser", idOfLoggedInUser);
		if(idOfLoggedInUser == book.getUser().getId()) {
		return "editBook.jsp";
	} else {
		return "redirect:/home";
		}
				
	}
	
	// Submit updates
    @PutMapping("/books/{id}/update")
    public String update(@PathVariable("id") Long id, @Valid @ModelAttribute("book") Book book, BindingResult result) {
        if (result.hasErrors()) {
            return "editBook.jsp";
        } else {
            System.out.println();
            bookServ.updateBook(book, id);
            return "redirect:/home";
        }
    }
    // Delete a book
    @DeleteMapping("/books/{id}/delete")
    public String destroy(@PathVariable("id") Long id) {
        bookServ.delete(id);
        return "redirect:/home";
    }
	
}