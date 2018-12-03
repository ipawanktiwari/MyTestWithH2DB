package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Person;
import com.example.repo.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository personRepository;
	
	public Person savePerson() {
		Person p = new Person();
		p.setFullname("Pawan");
		personRepository.save(p);
		return p;
		
	}

}
