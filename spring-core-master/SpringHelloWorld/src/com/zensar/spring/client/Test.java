package com.zensar.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.beans.Employee;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		Employee employee=(Employee)context.getBean("emp");
		
		System.out.println(employee);
		
		
		//Employee employee=new Employee(1001, "Ram", 20000);
		
		//System.out.println(employee);

	}

}
