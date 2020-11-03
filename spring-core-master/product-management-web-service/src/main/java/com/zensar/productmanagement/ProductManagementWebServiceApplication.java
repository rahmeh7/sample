package com.zensar.productmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

import com.zensar.productmanagement.beans.Product;

import test.ProductController;

@SpringBootApplication
@ComponentScans(value = { @ComponentScan("test") , @ComponentScan("com.zensar.productmanagement")})
public class ProductManagementWebServiceApplication  {
	
	@Autowired
	private ProductController controller;
	
	public static void main(String[] args) {
		// SpringApplication.run(ProductManagementWebServiceApplication.class, args);
		
		//System.setProperty("server.port", "7000");
		
		new SpringApplicationBuilder(ProductManagementWebServiceApplication.class)
		.properties("spring.config.name:application")
		.properties("server.port:4000")
		.build()
		.run(args);
		
	}



	


}
