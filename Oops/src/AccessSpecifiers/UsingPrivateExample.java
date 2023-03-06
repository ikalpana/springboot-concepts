package AccessSpecifiers;

public class UsingPrivateExample {
	public static void main(String[] args) {
		//MedicalStudent s = new MedicalStudent(1);
		College c = new College(1);
		System.out.println("college"+c.getMarks());
		//System.out.println(s.getMarks());
		
	}
}
class MedicalStudent
{
	private int marks;

	private MedicalStudent(int marks) {
		super();
		this.marks = marks;
	}

	private int getMarks() {
		return marks;
	}

	
	
}