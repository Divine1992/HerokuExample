package com.springboot.helloworld.dao;

import java.util.List;

import org.springframework.boot.CommandLineRunner;

public class PersonRunner implements CommandLineRunner{
	private PersonRepository personRepository;
	
	public PersonRunner(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	
	@Override
	public void run(String... args) throws Exception {
		Person p1 = new Person("Adam", 15);
		Person p2 = new Person("Glen", 20);
		Person p3 = new Person("Morris", 36);
		personRepository.save(p1);
		personRepository.save(p2);
		personRepository.save(p3);
		getPersons();
	}

	private void getPersons() {
		List<Person> persons = personRepository.findAll();	
		persons.forEach(System.out::println);
	}

}
