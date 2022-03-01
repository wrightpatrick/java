package com.wright.login.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wright.login.models.Book;
import com.wright.login.repositories.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository bookRepo;
	

	// create new book
	public Book create(Book b) {
		return this.bookRepo.save(b);
	}
	
	// list all books
	public List<Book> findAll(){
		return (List<Book>)this.bookRepo.findAll();
	}
	
	// retrieves a book if it exists (optional)
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepo.findById(id);
        if (optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    
 // update a book
    public Book updateBook(Book book, Long id) {
        Optional<Book> optionalBook = bookRepo.findById(id);
        if (optionalBook.isPresent()) {
        Book book1 = optionalBook.get();
        book1.setTitle(book.getTitle());
        book1.setAuthor(book.getAuthor());
        book1.setMyThoughts(book.getMyThoughts());
            return bookRepo.save(book1);
        } else {
            return null;
        } 
    }
    // delete a book
    public String delete(Long id) {
        Optional<Book> optionalBook = bookRepo.findById(id);
        if (optionalBook.isPresent()) {
            bookRepo.deleteById(id);
            return "Deleted";
        } else {
            return "No book to delete";
        }
    }
    
}