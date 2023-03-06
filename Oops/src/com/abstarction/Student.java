package com.abstarction;

public class Student extends College{
	// This  is used to call super class constructor of college
	Student(String collegeName){
		super(collegeName);
	}
	public static void main(String[] args){ 
	// Creating an object of the subclass of abstract class. 
		
		College c=new Student("kakatiya");
		c.collegeNames();	
	}
	{
		System.out.println("he");
	}
	
}
