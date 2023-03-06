package AccessSpecifiers.diff;

import AccessSpecifiers.College;
import AccessSpecifiers.Institute;
import AccessSpecifiers.Student;

public class UsingProtected  extends College{

	

	public UsingProtected(int marks) {
		super(marks);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Student i = new Student(1);
		UsingProtected pro = new UsingProtected(0);
		
		// Institute c = new Institute(1);
		System.out.println(pro.getMarks());

	}
	
	
	
}
