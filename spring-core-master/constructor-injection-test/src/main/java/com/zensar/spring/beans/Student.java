package com.zensar.spring.beans;

public class Student {
	
	private int rollNumber;
	private String studentName;
	private int marks;
	
	
	public Student() {
		super();
		System.out.println("Inside student const !!!");
	}
	
	public Student(String studentName, int rollNumber,int marks) {
		super();
		System.out.println(" inside public Student(String studentName, int rollNumber,int marks)");
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.marks = marks;
	}
	
	public Student(int rollNumber, String studentName, int marks) {
		super();
		System.out.println("inside public Student(int rollNumber, String studentName, int marks) ");
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.marks = marks;
	}
	
	public Student(String rollNumber, String studentName, String marks) {
		System.out.println("inside public Student(String rollNumber, String studentName, String marks) ");
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
		return "Student [rollNumber=" + rollNumber + ", studentName=" + studentName + ", marks=" + marks + "]";
	}
	
	

}
