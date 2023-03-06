package collections.interfaces;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();
        //by using add methods
        cities.add("Hyderabad");
        cities.add("Banglore");

        //by using add(position, element) method
        cities.add(2, "Mumbai");
        cities.add(3, "Pune");

        //by using addFirst method
        cities.addFirst("Delhi");

        //by using addLast method
        cities.addLast("Chennai");

        System.out.println("Cities " + cities);

        //clone List
        LinkedList<String> cities1 = new LinkedList<>();
        cities1 = (LinkedList) cities.clone();
        System.out.println("Cities1 "+cities1);

        //getting first element by using getFirst()
        String firstElement = cities1.getFirst();
        System.out.println("First element is " + firstElement);

        //getting last element by using getLast()
        String lastElement = cities1.getLast();
        System.out.println("Last element is " + lastElement);

        //getting the element by using the position
        String element = cities1.get(3);
        System.out.println("The element at index 3 is " + element);

        //getting all the elements
        for (String elements : cities1) {
            System.out.println(elements);

        }

        //removing 1st element
        cities1.removeFirst();
        System.out.println("After removing 1st String " + cities1);

        //removing last element
        cities1.removeLast();
        System.out.println("After removing last string " + cities1);

        //removing specified element
        cities1.remove("Pune");
        System.out.println("After removing String3 " + cities1);


        //using contains method
        boolean res = cities1.contains("Mumbai");
        System.out.println("City " + res);

        //finding index
        int index = cities1.indexOf("Hyderabad");
        System.out.println("Hyderabad index is " + index);

        //finding last Index
        int lastIndex = cities1.lastIndexOf("Mumbai");
        System.out.println("Mumbai last index " + lastIndex);

        //peak method
        System.out.println("top of the List : " + cities1.peek());
        //peekFirst method
        System.out.println("First element of the list : " + cities1.peekFirst());
        //peekLast method
        System.out.println("Last element of the list : " + cities1.peekLast());

        //poll method
        System.out.println("Removed head element : " + cities1.poll());
        //pollFirst method
        System.out.println("Removed First element : " + cities1.pollFirst());
        //pollLast method
        System.out.println("Removed last element : " + cities1.pollLast());
        System.out.println("Final list : " + cities1);

        //clearing all elements
        cities1.clear();
        System.out.println("Empty LinkedList " + cities1);

        //offer method
        cities1.offer("Delhi");
        //offerFirst method
        cities1.offerFirst("Indore");
        //offerLast method
        cities1.offerLast("Gujrath");
        System.out.println("After using offer methods : " + cities1);


    }
}
