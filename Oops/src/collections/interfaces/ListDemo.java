package collections.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
	List<String> list=new ArrayList<>();
	//check an array List is empty or not
	System.out.println("Is empty :" +list.isEmpty());
	list.add("kalpana");
	list.add("manisai");
	list.add("anjali");
	list.add("saipavan");
	//reversing arrayList
	ArrayList<String> l=reverseArray(list);
	System.out.println("Reversing an Array:"+l);
	System.out.println("List of elements:"+list);
	//
	Collections.sort(list); //Asc order
	 System.out.println("Ascending order " + list);
	Collections.reverse(list); //Desc order
	 System.out.println("Descending order " + list);
	 
	//List allows us to add duplicate elements
	list.add("saipavan");
	System.out.println("List with duplicate elements:"+list);
	//List allows us to add null elements
	list.add(null);
	System.out.println("List with null elements:"+list);
	//insertion order
	list.add("element1");
	list.add("element2");
	list.add("element3");
	System.out.println("List of elements with insertion order:"+list);
	//access elements from the list by using index 
	System.out.println("access elements from the list:"+list.get(0));
	String string1 = list.get(1);
	System.out.println("List at index 1 is:"+string1);
	System.out.println("Size of the List:"+list.size());
	//modify an element at given index
	list.set(4, "Bhavani");
	System.out.println("modifying an element at given index:"+list);
	//removing an element from the list
	list.remove(5);
	list.remove("element3");
	System.out.println("After removing an element from the List:"+list);
	ArrayList<String> list1=new ArrayList<>();
	list1.add("a");
	list1.add("b");
	list1.add("c");
	//removing Multiple elements from the list
	list.addAll(list1);
	System.out.println(list);
	list.removeAll(list1);
	System.out.println(list);
	// clearing all elements from the list
	list.clear();
	System.out.println(list);
	List<String> cities = Arrays.asList("Hyderabad", 
			"Bangalore", "Vizag", "Mumbai", "Pune");
	//basic for loop
	for(int i=0;i<cities.size();i++) 
		System.out.println(cities.get(i));
	//Enhanced for each loop
	System.out.println("By Using for each loop");
	for(String city:cities) {
	System.out.println(city);
	}
	//basic loop iterator
	System.out.println("using loop with iterator");
	for(Iterator iterator=cities.iterator();iterator.hasNext();) {
		String city=(String) iterator.next();
		System.out.println(city);
	}
	// iterator with while loop
	 System.out.println("using iterator with while loop");
	 Iterator<String> iterator=cities.iterator();
	 while(iterator.hasNext()) {
		 String city=(String) iterator.next();
		 System.out.println(city);
	 }
	 ArrayList<String> list2=reverseArray(cities);
		System.out.println(list2);
	 ArrayList<String> lists=reverseArray(list1);
	System.out.println(lists);
	}
	public static ArrayList<String> reverseArray(List<String> list){
		ArrayList<String> res=new ArrayList<>();
		for(int i=list.size()-1;i>=0;i--) {
			res.add(list.get(i));
		}
		return res;
	}
}
