package com.nordea.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nordea.model.Person;

@Repository
public interface PersonRepository extends CrudRepository<com.nordea.model.Person, Long> {

	
}
