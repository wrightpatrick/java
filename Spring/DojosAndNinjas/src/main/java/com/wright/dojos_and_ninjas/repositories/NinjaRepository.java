package com.wright.dojos_and_ninjas.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wright.dojos_and_ninjas.models.Ninja;


@Repository
public interface NinjaRepository extends CrudRepository<Ninja, Long>{

}
