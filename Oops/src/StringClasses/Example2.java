package StringClasses;

import java.lang.reflect.Array;
import java.util.Arrays;

import ExceptionHandling.NotFoundException;

public class Example2 {
//equals method
	public static void main(String[] args) {
		Student s = new Student(1, "Anjali", "anjali@gmail.com", 1000);
		Student s1 = new Student(1, "Anju", "anju@gmail.com", 1000);
		Student s2 = new Student(1, "Anjali", "anjali@gmail.com", 1000);
		// Compare two Strings
		System.out.println(s.getName().equals(s1.getName()));
		System.out.println(s.getName() == (s2.getName()));
		// checks whether the string contains
		if (s.getEmail().contains("@")) {
			System.out.println("valid email " + s.getEmail());
		} else {
			System.out.println("not a valid email " + s.getEmail());
		}

		// CompareTo
		System.out.println("CompareTo:-" + s.getName().compareTo(s1.getName()));
		// join two strings using concat
		System.out.println(s2.getName() + s1.getName());
		System.out.println("join two strings using concat:-" + s2.getName().concat(s1.getName()));
		String concat = s1.getName().concat("Gunduka");
		System.out.println(concat);

		// length
		System.out.println("length of the string:-" + s2.getName().length());
		// subString
		// after string length 2 will be printed
		System.out.println("substring:-" + s.getName().substring(2));
		// 0 to 2 string will be printed
		System.out.println("substring:-" + s.getName().substring(0, 2));
		// split
		String[] sentences = s.getName().split("\\.");
		System.out.println("split method" + Arrays.toString(sentences));
		// toUppercase:-converts the string to uppercase
		System.out.println("toUppercase:-" + s1.getName().toUpperCase());

		String str = "124";

		str = str.replaceAll("[^0-9]", "");
		System.out.println("Numbers :-" + str);

		// charAt
		System.out.println("location of the string :-" + s1.getName().charAt(1));
		// Mutable String
		StringBuilder ss = new StringBuilder(s1.getName()); // Anju
		StringBuilder sss = new StringBuilder(s.getName()); // Anjali
		sss = new StringBuilder(s1.getName()); // it changed to Anju
		StringBuilder ssss = ss.append(sss);
		System.out.println(ssss.toString());

		String strs = "poiytyfJK?IHGUG";
		int i = strs.indexOf('?');
		strs = strs.substring(0, i);
		System.out.println(strs);
//fibonacci
		
	}
}
