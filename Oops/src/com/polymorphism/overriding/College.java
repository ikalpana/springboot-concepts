package com.polymorphism.overriding;

public class College {

	private int marks;

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public College() {
		super();
	}

	public College(int marks) {
		super();
		this.marks = marks;
	}

	public void calculateMarks()
	{
		System.out.println("calculating the marks "+getMarks());
	}
}
