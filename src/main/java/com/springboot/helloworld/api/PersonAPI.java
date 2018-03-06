package com.springboot.helloworld.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.helloworld.dao.Person;
import com.springboot.helloworld.dao.PersonRepository;

@RestController
@RequestMapping("/person")
public class PersonAPI {
	private PersonRepository personRepository;
	
	public PersonAPI(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	
	@GetMapping("/getall")
	public List<Person> getAllPersons(){
		return personRepository.findAll();
	}

}
