package com.springboot.helloworld;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.springboot.helloworld.dao.Person;
import com.springboot.helloworld.dao.PersonRepository;

@SpringBootApplication
@ComponentScan(basePackages ="com.springboot.helloworld")
public class HelloWorldApplication{
	
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}
}
