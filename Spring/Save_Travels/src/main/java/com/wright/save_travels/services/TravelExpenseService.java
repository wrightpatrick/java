package com.wright.save_travels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.wright.save_travels.models.TravelExpense;
import com.wright.save_travels.repositories.TravelExpensesRepository;

@Service
public class TravelExpenseService {
	
	//add a repository as a dependency
	private final TravelExpensesRepository travelExpensesRepository;
	
	public TravelExpenseService(TravelExpensesRepository travelExpensesRepository) {
		this.travelExpensesRepository = travelExpensesRepository;
	}
	
	//returns all expenses
	public List<TravelExpense> allTravelExpenses() {
		return (List<TravelExpense>)this.travelExpensesRepository.findAll();
	}
	
	//create a travel expense
	public TravelExpense createTravelExpense(TravelExpense e) {
		return travelExpensesRepository.save(e);
	}
	
	//retrieves a single travel expense
	public TravelExpense findExpense(Long id) {
		Optional<TravelExpense> optionalExpense = travelExpensesRepository.findById(id);
		if(optionalExpense.isPresent()) {
			return optionalExpense.get();
		} else {
			return null;
		}
	}

}
