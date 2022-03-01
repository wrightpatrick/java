package com.wright.login.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wright.login.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
	
}
