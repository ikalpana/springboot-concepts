package com.inheritance.multilevel;

import com.inheritance.Student;

//inheriting properties from Student
public class MedicalStudent extends Student{
	
	public void show2()
	  {
	    System.out.println("MedicalStudent inheriting properties from Student");
	  }

	public static void main(String[] args)
	{
		MedicalStudent d=new MedicalStudent();
		d.studentdetails();
		d.showPersonDetails();
	}
}
