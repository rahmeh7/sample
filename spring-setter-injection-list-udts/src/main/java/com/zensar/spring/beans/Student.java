package com.zensar.spring.beans;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Student {
	
	private int rollNumber;
	private List<String> studentName;
	private int marks;
	private List<Address> address;
	
	private Properties certification;
	
	
	public Student() {
		super();
		System.out.println("Inside student const !!!");
	}
	
	
	
	public List<Address> getAddress() {
		return address;
	}



	public void setAddress(List<Address> address) {
		this.address = address;
	}



	public Student(int rollNumber, List<String> studentName, int marks) {
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
	public List<String> getStudentName() {
		return studentName;
	}
	public void setStudentName(List<String> studentName) {
		this.studentName = studentName;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}



	public Properties getCertification() {
		return certification;
	}



	public void setCertification(Properties certification) {
		this.certification = certification;
	}



	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", studentName=" + studentName + ", marks=" + marks + ", address="
				+ address + ", certification=" + certification + "]";
	}



	



	
	
	
	

}
