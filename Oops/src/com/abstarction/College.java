package com.abstarction;
/**
 * 
 * overriding the methods
 *
 */
public abstract class College {

	private String collegeName;

	public void collegeNames() {
		System.out.println("name of the college is :-" + collegeName);
	}

	public College(String collegeName) {
		super();
		this.collegeName = collegeName;
	}


	@Override
	public String toString() {
		return "College [collegeName=" + collegeName + "]";
	}

}
