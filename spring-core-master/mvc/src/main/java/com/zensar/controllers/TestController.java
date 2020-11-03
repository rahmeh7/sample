package com.zensar.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	// http://localhost:8080/mvc/hi
	@RequestMapping("/hi")
	public String sayHi() {
		return "hi";
	}

	// http://localhost:8080/mvc/hi/Ravi
	/*
	 * @RequestMapping("/hi/{name}") public String
	 * sayHiToThePerson(@PathVariable("name") String name) {
	 * System.out.println(name); return "hi"; }
	 */

	/*
	 * @RequestMapping("/hi/{name}") public String sayHiToThePerson(@PathVariable
	 * String name) { System.out.println(name); return "hi"; }
	 */

	/*
	 * @RequestMapping("/hi/{number1}/{number2}") public String
	 * sayHiToThePerson(@PathVariable("number1") int num1,@PathVariable("number2")
	 * int num2,HttpServletRequest request,HttpServletResponse response) { int
	 * add=num1+num2; request.setAttribute("add", add);
	 * //model.addAttribute("addition", add); return "hi"; }
	 */

	@RequestMapping("/hi/{number1}/{number2}")
	public String sayHiToThePerson(@PathVariable("number1") int num1, @PathVariable("number2") int num2, Model model) {
		int add = num1 + num2;
		model.addAttribute("add", add);
		// model.addAttribute("addition", add);
		return "hi";
	}

}
