package com.zensar.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.zensar.spring.beans.Student;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		//Student student = (Student) context.getBean("student");
		
		/*
		 * Resource resource=new FileSystemResource("applicationContext.xml");
		 * 
		 * BeanFactory beanFactory=new XmlBeanFactory(resource);
		 */
		
		BeanFactory factory=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Student student=(Student)factory.getBean("student");
		
		
		
		//Student student=beanFactory.getBean(Student.class,"student");
		
		student.setRollNumber(1001);
		
		student.setStudentName("Ravi");
		
		student.setMarks(95);
		
		

		System.out.println(student);
	}
}
