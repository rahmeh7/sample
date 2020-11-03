package com.zensar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.beans.Student;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		//Student student = (Student) context.getBean("student");
		
		Student student=context.getBean(Student.class,"student");

		/*
		 * student.setRollNumber(1001);
		 * 
		 * student.setStudentName("Ravi");
		 * 
		 * student.setMarks(95);
		 */

		System.out.println(student);
	}
}
