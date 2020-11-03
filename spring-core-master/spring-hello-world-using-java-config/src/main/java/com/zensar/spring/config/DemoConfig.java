package com.zensar.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.zensar.spring.beans.Address;
import com.zensar.spring.beans.Student;


// DemoConfig -> applicationContext.xml


@Configuration
@ComponentScan("com.zensar.spring.beans")
@PropertySource("studentInfo.properties")
public class DemoConfig {
	
	/*@Bean(name = "student")
	public Student getStudent() {
		Student student=new Student();
		student.setRollNumber(101);
		student.setStudentName("Rahul");
		student.setMarks(90);
		student.setAddress(getAddress());
		return student;
	}
	
	@Bean(name="address")
	public Address getAddress() {
		return new Address(411016, "Pune", "Maha");
	}*/
	
	
	

}
