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
	
	@GetMapping("/bye")
	public String sayBye() {
		return"<h1> Bye....!!! Jenkins ;-) </h1>";	
	}
	
	@GetMapping("/welcome")
	public String start() {
		return"<h1> Welcome !!!!!</h1>";	
	}
	
	@GetMapping("/gm")
	public String goodMorning() {
		return"<h1> Happy Morning !!!!!</h1>";	
	}
}
