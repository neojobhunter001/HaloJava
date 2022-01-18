package com.neo.HaloJava.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HaloController 
{
	@GetMapping(value = "/")
	public String getPage()
	{
		return "Welcome to Java Spring Boot";
	}
}
