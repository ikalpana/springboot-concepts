package com.polymorphism.overriding;

public class Student extends College {
	// This  is used to call super class constructor of college. 
	public Student(int marks) {
		super(marks);
	}

	public void calculateMarks() {
		System.out.println("calculating the marks of the student " + getMarks());
	}
}
