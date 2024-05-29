package com.zensar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hi")
	public String sayHi() {
		return"<h1> Welcome to Jenkins and say Hi.........</h1>";	
	}
	
	@GetMapping("/hello")
	public String sayHello() {
		return"<h1> Welcome to Jenkins </h1>";	
	}
}
