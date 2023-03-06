package AccessSpecifiers;

public class Student {

	// public access variable
	public int marks;

	// public access constructor
	public Student(int marks) {
		super();
		this.marks = marks;
	}

	// A public access method that return myData
	public int getMarks() {
		return marks;
	}
}
