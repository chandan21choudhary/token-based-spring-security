package com.java.apigaeway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class ApiController {
	
	@GetMapping("/hello")
	public String welcomeGreetings() {
		
		System.out.println("Hello");
		
		return "Hello welocme to Home page";
	}

}
