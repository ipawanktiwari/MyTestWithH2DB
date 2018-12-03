package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Person;
import com.example.service.PersonService;

@RestController
public class PersonController {
	@Autowired
	private PersonService personService;

	@PostMapping(value = "/test")
	public Person checkTest() {
		System.out.println("PWan");
		return personService.savePerson();
	}

}
