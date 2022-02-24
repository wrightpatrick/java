package com.wright.dojos_and_ninjas.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wright.dojos_and_ninjas.models.Dojo;
import com.wright.dojos_and_ninjas.repositories.DojoRepository;

@Service
public class DojoService {
	private final DojoRepository dojoRepo;

	// constructor
	public DojoService(DojoRepository dojoRepo) {
		this.dojoRepo = dojoRepo;
	}

	// create a dojo
	public Dojo createDojo(Dojo d) {
		return dojoRepo.save(d);
	}

	// retrieves all the dojos
	public List<Dojo> allDojos() {
		return (List<Dojo>)this.dojoRepo.findAll();
	}
	
	// get one dojo by ID
	public Dojo getOneDojoById(Long id) {
		 
		return dojoRepo.findById(id).get();
	}
}
