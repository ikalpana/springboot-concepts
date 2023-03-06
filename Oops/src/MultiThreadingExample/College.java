package MultiThreadingExample;

public class College extends Thread {

	private double totalMarks;
	private Student st;

	public College(double totalMarks, Student st) {
		super();
		this.totalMarks = totalMarks;
		this.st = st;
	}

	public double getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(double totalMarks) {
		this.totalMarks = totalMarks;
	}

	public Student getSt() {
		return st;
	}

	public void setSt(Student st) {
		this.st = st;
	}

	public void run() {
		st.getMarksOfStudent(totalMarks);
	}
}
