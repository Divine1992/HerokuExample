package com.springboot.helloworld;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.springboot.helloworld.dao.Person;
import com.springboot.helloworld.dao.PersonRepository;

@SpringBootApplication
@ComponentScan(basePackages ="com.springboot.helloworld")
public class HelloWorldApplication implements CommandLineRunner{
	private PersonRepository personRepository;
	
	public HelloWorldApplication (PersonRepository personRepository) {
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
	}
	
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}
}
