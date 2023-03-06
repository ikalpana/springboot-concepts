package AccessSpecifiers;

public class UsingProtectedExample {
	public static void main(String[] args) {

		College c = new College(1);
		Institute i = new Institute(1);
		System.out.println(c.getMarks());
		System.out.println(i.getMarks());

	}
}
