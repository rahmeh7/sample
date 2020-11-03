package com.zensar.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {
	
	
	
	// http://localhost:8080/mvc/hello
	@RequestMapping("/hello")
	public String sayHello() {
		return "hello";  // logical name of the view, velocity,freemarker,thymeleaf etc
	}
	
	// http://localhost:8080/mvc/hi
			@RequestMapping("/hello/hi")
			public String sayHi() {
				return "hi";
			}
	
	
	
}
