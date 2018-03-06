package com.springboot.helloworld.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloAPI {
	
	@GetMapping("/hello")
	public String hello() {
		return "Helllo World!";
	}
	
	@GetMapping
	public String welcome() {
		return "Welcome";
	}
	
	@GetMapping("/add")
	public String additional() {
		return "Additional test";
	}

}
