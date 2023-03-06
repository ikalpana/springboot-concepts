package collections.interfaces.comparator;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class IteratorsExample {
	public static void main(String[] args) throws ClassNotFoundException {
		Vector<Integer> vector = new Vector<>();
		vector.add(1);
		vector.add(2);
		 vector.add(3);
		 System.out.println("Vector: ");

		 Enumeration<Integer> enumeration = vector.elements();
		 while (enumeration.hasMoreElements()) {
			 System.out.print(enumeration.nextElement() + " ");
		 }
		 List<Integer> list = new ArrayList<Integer>();
		 list.add(1);
		 list.add(2);
		list.add(3);
		System.out.println("\nList Before Remove: ");
		 Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
		System.out.print(iterator.next() + " ");
		 iterator.remove();
		}
	 System.out.println("\nList After remove: ");
		Iterator<Integer> iterator1 = list.iterator();
		while (iterator1.hasNext()) {
		 System.out.print(iterator1.next() + " ");
		}
		 List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		 list1.add(3);
		 System.out.println("\nList using ListItertor (Forward): ");
		ListIterator<Integer> listIterator = list1.listIterator();
		while (listIterator.hasNext()) {
		 System.out.print(listIterator.next() + " ");
		}
	 System.out.println("\nList using ListItertor (Backward): ");
		 while (listIterator.hasPrevious()) {
			 System.out.print(listIterator.previous() + " ");
		
	}
}
}