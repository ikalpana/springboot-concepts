package AccessSpecifiers;

public class College {
	protected int marks;

	protected College(int marks) {
		super();
		this.marks = marks;
	}

	protected int getMarks() {
		return marks;
	}
}
