package MultiThreadingExample;

public class MultithreadingDemo {

	public static void main(String[] args) {

		Student s = new Student(1, 500);
		Student s1=new Student(2,100);
		College c = new College(500, s);
		College c1 = new College(500, s1);
		c.start();
		c1.start();

	}
}
