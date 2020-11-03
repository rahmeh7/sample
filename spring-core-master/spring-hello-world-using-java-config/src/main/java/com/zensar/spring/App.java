package com.zensar.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.zensar.spring.beans.Student;
import com.zensar.spring.config.DemoConfig;

public class App {
	public static void main(String[] args) {

		//ConfigurableApplicationContext context = new ClassPathXmlApplicationContext().addAnn

		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DemoConfig.class);
		//Student student = (Student) context.getBean("student");
		
		Student student=context.getBean("student",Student.class);
		
		
		System.out.println(student);
		
		context.registerShutdownHook();
	}
}
