package com.inheritance;

public class Person {

	private String name = "Anjali";
	private int age = 17;
	private String city = "Delhi";

	public void showPersonDetails() {
		System.out.println("Student inheriting properties from Person:-\n" +"name :-"+ name +" "+ "age of the person:- " + age
				+ "City of the person:-" + city);
	}
}
