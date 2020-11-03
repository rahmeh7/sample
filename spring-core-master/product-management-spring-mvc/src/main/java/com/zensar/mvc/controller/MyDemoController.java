package com.zensar.mvc.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class MyDemoController{
	private String[] colors={"red","blue","orange"};
	
	@RequestMapping(value="/getcolor")
	public String getRandomColor(Model model){
		int rand=new Random().nextInt(colors.length);
		String randomColor=colors[rand];
		model.addAttribute("randomColor",randomColor);
		return "randomColor";
	}
}
