package com.tuto.model.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("")
	public String sayHello()
	{
		return "Spring is coming";
	}
}
