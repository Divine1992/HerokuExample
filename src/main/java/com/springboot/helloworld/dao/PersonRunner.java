package com.springboot.helloworld.dao;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PersonRunner implements CommandLineRunner{
	private PersonRepository personRepository;
	
	public PersonRunner (PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	
	@Override
	public void run(String... args) throws Exception {
		Person p1 = new Person("Anna", 15);
		Person p2 = new Person("Glen", 20);
		Person p3 = new Person("Ben", 36);
		personRepository.save(p1);
		personRepository.save(p2);
		personRepository.save(p3);
	}
	
}
