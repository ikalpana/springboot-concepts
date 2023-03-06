package UsingBlocksAndConstructors;

public class UsingBlocksExample {
	public static void main(String[] args) {
		Student s = new Student();
		s.nonStaticMethod();
		s.staticMethod();
		s.studentnonStaticMethod();
		s.studentStaticMethod();
	}
}

class Student extends College {
	// 2.It will execute second
	static {
		System.out.println("static Block in Student");
	}

	// 10.It will execute tenth
	public static void studentStaticMethod() {
		System.out.println("static Method in Student");
	}

	// 5.It will execute fifth
	{
		System.out.println("non-static Block in Student");
	}

//9.It will execute ninth
	public void studentnonStaticMethod() {
		System.out.println("non-static Method in Student");
	}

	// 6.It will execute sixth
	Student() {
		System.out.println("Constructor Block in Student");
	}

}

class College {
	// 1.It will excute first
	static {
		System.out.println("static Block in College");
	}

	// 8.It will execute Eighth
	public static void staticMethod() {
		System.out.println("static Method in College");
	}

	// 3.It will execute Third
	{
		System.out.println("non-static Block in College");
	}

	// 7.It will execute seventh
	public void nonStaticMethod() {
		System.out.println("non-static Method in College");
	}

	// 4.It will execute fourth
	College() {
		System.out.println("Constructor Block in College");
	}
}
