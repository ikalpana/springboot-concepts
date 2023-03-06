package StringClasses;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StringExample {

	// creating a string by using the literals
	public static String string1 = "String1";

	// creating a string by using the new keyword
	public static String string2 = new String("String2");

	// join to strings (example to immutable)
	public static String twoStrings = string1.concat(string2);

	public static void main(String[] args) {
		// get the length of string
		System.out.println("Length of string1: " + string1.length());
		System.out.println("Concated String: " + twoStrings);

		// comparing two Strings
		System.out.println("Strings first and second are equal: " + string1.equals(string2));

		// using the contains method
		System.out.println("using the contains method: " + string1.contains("1"));

		// extract substring from index 0 to 3
		System.out.println("extracting the substring: " + twoStrings.substring(0, 4));

		String one = "Hi";
		String two = "Good";
		String three = "Morning";

		// join strings with space between them
		String joinedStr = String.join(" ", one, two, three);
		System.out.println("Joinstrings :-" + joinedStr);
		// replace old character with charecter
		System.out.println(one.replace('i', 'I'));

		// to uppercase
		System.out.println("String with uppercase: " + two.toUpperCase());

		// checks empty or not
		System.out.println("Checking empty or not: " + three.isEmpty());

		// return the hashcode
		System.out.println("Hash code: " + three.hashCode());

		// getting letters from a string
		String string1 = "AnjaliGunduka123";
		System.out.println("Getting letters from a string : " + string1.replaceAll(("\\d+"), ""));

		// using replace and replaceALl methods
		String string2 = "+a-+b";
		System.out.println("using replace method: " + string2.replace("+", "#"));
		System.out.println("using replace All method: " + string2.replaceAll("\\+", "#"));

		// by using the replace first method
		String string3 = "aabbaaac";
		System.out.println("by using the replace first method : " + string3.replaceFirst("aa", "zz"));

		// using the charAt method
		System.out.println("using the charAt method : " + string3.charAt(2));

		// using the getBytes method
		byte[] byteArray = string3.getBytes(StandardCharsets.UTF_8);
		System.out.println("using the getBytes method : " + Arrays.toString(byteArray));

		// using the indexOf method
		System.out.println("using the indexOf method : " + string3.indexOf('b'));

		// using the contentEquals method
		System.out.println("using the contentEquals method : " + string1.contentEquals(string2));

		// using the endsWith and startsWith method
		System.out.println("using the endsWith method : " + string1.endsWith("anjali"));
		System.out.println("Using the starts with method : " + string1.startsWith("Gunduka"));

	}
}
