package com.zensar.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {
	
	@RequestMapping(value = "/",method=RequestMethod.POST)
	public String welcome() {
		System.out.println("Inside welcome() handler method !!!!");
		return "welcome";
	}

}
