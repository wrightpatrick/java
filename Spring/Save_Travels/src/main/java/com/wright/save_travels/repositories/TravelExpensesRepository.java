package com.wright.save_travels.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wright.save_travels.models.TravelExpense;

@Repository
public interface TravelExpensesRepository extends CrudRepository<TravelExpense, Long>{
	// retrieve all expenses
	List<TravelExpense> findAll();
}
