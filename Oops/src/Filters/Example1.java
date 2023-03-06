package Filters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example1 {
	public static void main(String[] args) {

		Student s = new Student(534, "Anjali", 30000);
		Student s1 = new Student(531, "Neha", 50000);
		Student s2 = new Student(513, "Lalitha", 60000);
		Student s3 = new Student(531, "Nirosha", 80000);
		Student s5 = new Student(510, "Preethi", 50000);
		List<Student> list = new ArrayList<Student>();
		list.add(s);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s5);
		// creating stream from list and filter
		list.stream().filter(e -> e.getName().equalsIgnoreCase("Anjali")).forEach(System.out::println);

		list.stream().filter(e -> e.getName() == "Anjali").forEach(System.out::println);

		list.stream().filter(e -> e.getMarks() >= 50000).forEach(System.out::println);

		list.stream().filter(n -> n.getMarks() % 2 == 0).forEach(System.out::println);

		// Filter method with predicate

		Predicate<Student> p = ss -> ss.getMarks() >= 50000;

		list.stream().filter(p).forEach(ss -> System.out.println("marks:-" + ss));

		// filter two methods using And

		Predicate<Student> p1 = e -> e.getName().length() >= 5;

		list.stream().filter(p.and(p1)).forEach(ss -> System.out.println("applying two filters using And:-" + ss));

		// filter two methods using or
		list.stream().filter(p.or(p1)).forEach(ss -> System.out.println("applying two filters using Or:-" + ss));

		// Getting a stream consisting of the elements having UpperCase Character

		list.stream().filter(str -> Character.isUpperCase(str.getName().charAt(0))).forEach(System.out::println);
		// starts with "A"

		list.stream().filter(ss -> ss.getName().startsWith("A")).forEach(ss -> System.out.println("starts with" + ss));

	}
}
