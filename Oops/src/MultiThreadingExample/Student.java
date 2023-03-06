package MultiThreadingExample;

public class Student extends Thread {

	private long id;
	private double marksOfStudent;

	public double getMarksOfStudent() {
		return marksOfStudent;
	}

	public void setMarksOfStudent(double marksOfStudent) {
		this.marksOfStudent = marksOfStudent;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Student(long id, double marksOfStudent) {
		super();
		this.id = id;
		this.marksOfStudent = marksOfStudent;
	}

	public synchronized void getMarksOfStudent(double marks) {
		if (marks <= getMarksOfStudent()) {
			System.out.println("student qualified:-" + marks);
		} else {
			System.out.println("student not qualified:-");
		}
	}

}
