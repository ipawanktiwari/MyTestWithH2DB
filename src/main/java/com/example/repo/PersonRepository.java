package com.example.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.domain.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{
	
	public Person findByfullname(String name);
	
	public Optional<Person> findById(Long id);

}
