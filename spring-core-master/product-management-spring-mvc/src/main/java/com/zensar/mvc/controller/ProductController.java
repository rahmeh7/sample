package com.zensar.mvc.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zensar.mvc.model.Product;
import com.zensar.mvc.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping(value = "/productInfo")
	public String productInfo(@ModelAttribute("product")Product product) {
		return "productInfo";
	}

	/*
	 * @RequestMapping("/insertProduct") public String
	 * insertProduct(@RequestParam(name = "productId", defaultValue = "10") int id,
	 * 
	 * @RequestParam(name="productName",defaultValue = "test") String name,
	 * 
	 * @RequestParam(name="productCost",defaultValue = "10") int cost,Model model) {
	 * 
	 * Product product=new Product(); product.setProductId(id);
	 * product.setProductName(name); product.setProductCost(cost);
	 * 
	 * model.addAttribute(product);
	 * 
	 * model.addAttribute("id", id); model.addAttribute("name", name);
	 * model.addAttribute("cost", cost);
	 * 
	 * 
	 * return "insertProduct"; }
	 */

	@RequestMapping("/insertProduct")
	public String insertProduct(@Valid @ModelAttribute Product product,BindingResult bindingResult) {

		/*
		 * String exception = "NullPointerException";
		 * 
		 * if (exception.equalsIgnoreCase("ArithmeticException")) { throw new
		 * ArithmeticException(); } else if
		 * (exception.equalsIgnoreCase("NullPointerException")) { throw new
		 * NullPointerException(); }
		 */
		
		if(bindingResult.hasErrors()) {
			return "productInfo";
		}

		int result = productService.acceptProduct(product);
		if (result > 0) {
			return "insertProduct";
		} else {
			return "productInfo";
		}
	}

	

	@ModelAttribute
	public void addCommonMessage(Model model) {
		String msg = "Product Management Application";
		model.addAttribute("msg", msg);
	}

}
