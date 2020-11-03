package com.zensar.spring.beans;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Student {
	
	private int rollNumber;
	private String studentName;
	private int marks;
	private List<Address> address;
	
	
	
	
	public Student() {
		super();
		System.out.println("Inside student const !!!");
	}
	
	
	
	
	public Student(int rollNumber, String studentName, int marks, List<Address> address) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.marks = marks;
		this.address = address;
	}




	public List<Address> getAddress() {
		return address;
	}



	public void setAddress(List<Address> address) {
		this.address = address;
	}



	public Student(int rollNumber, String studentName, int marks) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.marks = marks;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		System.out.println("inside public void setRollNumber(int rollNumber)");
		this.rollNumber = rollNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}



	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", studentName=" + studentName + ", marks=" + marks + ", address="
				+ address + "]";
	}

	

}
