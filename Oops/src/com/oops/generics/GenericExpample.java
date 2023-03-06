package com.oops.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.*;

class MyMathUtil<T> {
	public boolean isEqual(T num1, T num2) {
		return num1 == num2;
	}
}

public class GenericExpample {
	public static <E> void printArray(E[] elements) {
		for (E element : elements) {
			System.out.println(element);
		}
	}

	public static void main(String[] args) {
		MyMathUtil<Integer> m = new MyMathUtil<Integer>();
		System.out.println("Is numbers are Equal:" + m.isEqual(1, 1));
		MyMathUtil<String> m1 = new MyMathUtil<String>();
		System.out.println("Is double values are Equal:" + m1.isEqual("kalpana", "kalpana"));

		// *****
		ArrayList<String> list = new ArrayList<String>();
		list.add("rahul");
		list.add("jai");
		// list.add(32);//compile time error

		String s = list.get(1);// type casting is not required
		System.out.println("element is: " + s);

		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Kalpana");
		map.put(2, "Anjali");
		map.put(4, "manisai");
		Set<Map.Entry<Integer, String>> st = map.entrySet();

		Iterator<Map.Entry<Integer, String>> set = st.iterator();
		while (set.hasNext()) {
			Map.Entry e = set.next();
			System.out.println(e.getKey() + ":" + e.getValue());
		}
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Character[] charArray = { 'a', 'b', 'c', 'd' };
		System.out.println("printing Integer Array:");
		printArray(intArray);
		System.out.println("printing Character Array:");
		printArray(charArray);
	}

}
