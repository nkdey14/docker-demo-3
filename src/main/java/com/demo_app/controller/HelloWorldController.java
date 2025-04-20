package com.demo_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/message")
	public String getMessage() {
		
		return "Hey, I'm Nitin. I will be assisting you with your queries today";
	}
}
