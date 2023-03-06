package Filters;

public class Student {

	private long id;
	private String name;
	private double marks;

	public Student(long id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public Student() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

	/**
	 * method overloading
	 */
	public void marksOfStudent() {
		System.out.println("marks of students" + getMarks());
	}

	public void marksOfStudent(int marks) {
		System.out.println("marks of students" + marks);
	}

	public void marksOfStudent(int marks, String name) {
		System.out.println("marks of students" + marks + "name of the student" + name);
	}

}
