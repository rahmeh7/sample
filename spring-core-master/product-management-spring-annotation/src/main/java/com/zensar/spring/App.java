package com.zensar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.beans.Product;
import com.zensar.spring.service.ProductService;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
        
        
        ProductService service1= context.getBean("productService",ProductService.class);
       
       ProductService service2= context.getBean("productService",ProductService.class);
       
     if(service1==service2)
    	 System.out.println("Same ref");
     else
    	 System.out.println("Diff ref");
    
       ((ClassPathXmlApplicationContext)context).close();
    }
}
