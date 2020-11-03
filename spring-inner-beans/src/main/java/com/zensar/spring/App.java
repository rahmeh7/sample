package com.zensar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.beans.Address;
import com.zensar.spring.beans.Student;

public class App {
	public static void main(String[] args) {
		
		/*Address address=new Address(222222, "Mumbai", "Maha");
		
		Student student=new Student(1, "Rani", 20, address);
		
		System.out.println(student);
		
		
		Student student2=new Student(2,"Ravi",10,address);
		
		System.out.println(student2);
		
		
		Student student3=new Student(3, "Raj", 5, new Address(411016,"Pune","Maha"));
		
		System.out.println(student3);*/

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		//Student student = (Student) context.getBean("student");
		
		Student student=context.getBean(Student.class,"student");
		
		System.out.println(student);
	}
}
