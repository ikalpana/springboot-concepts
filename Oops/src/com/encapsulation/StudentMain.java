package com.encapsulation;

public class StudentMain {
	
	public static void main(String[] args)
	{
		Student student=new Student();
		student.setId(1);
		student.setMarks(2.0);
		student.setName("anjali");
		
		System.out.println(student);
	}

}
