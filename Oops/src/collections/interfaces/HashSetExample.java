package collections.interfaces;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> hset = new HashSet<String>();

        // Adding elements to the HashSet
        hset.add("Apple");
        hset.add("Mango");
        hset.add("Grapes");
        hset.add("Orange");

        //Addition of duplicate elements
        hset.add("Apple");
        hset.add("Mango");

        //Addition of null values
        hset.add(null);
        hset.add(null);
        System.out.println("HashSet elements : " + hset);

        // Using remove() method
        boolean value1 = hset.remove("Mango");
        System.out.println("Is Mango removed? " + value1);

        //using the remove all method
        boolean value2 = hset.removeAll(hset);
        System.out.println("Are all elements removed? " + value2);
    }
}
