package ExceptionHandling;

public class StudentMain {
	public static void main(String[] args) {

		String a="joh";
		a="iuguy";
		int b=2;
		b=3;
		
		
		Student s = new Student(1, "Anjali", "anjali@gmail.com", 5000);
		try {
			Student addStudent = addStudent(s);
			System.out.println(addStudent);
		} catch (NotFoundException e) {
			System.out.println(e.code);
		}

	}

	public static Student addStudent(Student student) throws NotFoundException {
		if (!student.getEmail().contains("@")) {
			throw new NotFoundException("not a valid email :-" + student.getEmail());
		}

		if (student.getName().contains("!")) {
			throw new NotFoundException("not a valid email :-" + student.getName());
		}
		return student;
	}

}
