package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class DemoRestController {

	@GetMapping("/demo-jenkins-docker")
	public String getData() {
		
		return " Suresh: sample program running demo-jenkins-docker";
				
	}	
	
}
