package com.vivek.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		
		return "Welcome to home page";
	}
	@GetMapping("/about")
	public String about() {
		
		return "Welcome to about page";
	}
	@GetMapping("/admin")
	public String adminDashboard() {
		
		return "Welcome to admin page";
	}

}
