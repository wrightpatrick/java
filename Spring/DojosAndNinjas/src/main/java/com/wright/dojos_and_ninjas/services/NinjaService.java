package com.wright.dojos_and_ninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.wright.dojos_and_ninjas.models.Ninja;
import com.wright.dojos_and_ninjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	private final NinjaRepository ninjaRepo;

	// constructor
	public NinjaService(NinjaRepository ninjaRepo) {
		this.ninjaRepo = ninjaRepo;
	}

	// retrieves all the ninjas
	public List<Ninja> allNinjas() {
		return (List<Ninja>) ninjaRepo.findAll();
	}

	// creates a Ninja
	public Ninja createNinja(Ninja n) {
		return ninjaRepo.save(n);
	}

	// retrieves a Ninja if it exists (optional)
	public Ninja findNinja(Long id) {
		Optional<Ninja> optionalNinja = ninjaRepo.findById(id);
		if (optionalNinja.isPresent()) {
			return optionalNinja.get();
		} else {
			return null;
		}
	}


}
