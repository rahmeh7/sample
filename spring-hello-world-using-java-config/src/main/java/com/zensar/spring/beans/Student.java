package com.zensar.spring.beans;

public class Student {

	private int rollNumber;
	private String studentName;
	private int marks;
    
	private Address address;
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Student() {
		super();
		System.out.println("Inside student const !!!");
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
	   System.out.println("inside  public void setRollNumber(int rollNumber)  ");
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

	
	
	/*public void afterPropertiesSet() throws Exception {
		System.out.println("inside public void afterPropertiesSet() throws Exception");
		
	}

	public void destroy() throws Exception {
		System.out.println("inside public void destroy() throws Exception");
		
	}*/

}
