package com.zensar.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.beans.Product;
import com.zensar.spring.service.ProductService;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
        
        ProductService service=context.getBean("service",ProductService.class);
        
        List<Product> allProducts = service.getAllProducts();
        
        for(Product product: allProducts) {
        	System.out.println(product);
        }
        
       //' System.out.println("Product inserted successfullyyyyy !!!");
        
    }
}
