package com.inheritance;



//child class
public class Student extends Person {

	int marks=200;
	public void studentdetails()
	  {
	      System.out.println("I am a Student who belongs to Person class");
	  }
	public static void main(String[] args)
	{
		Student s=new Student();
		s.showPersonDetails();
		
	}
	
	
}
