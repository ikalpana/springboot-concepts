package collections.interfaces;


import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple"); //0
        fruits.add("Mango"); //1
        fruits.add("Orange"); //2
        fruits.add("Pineapple"); //3
        fruits.add("Grapes"); //4
        System.out.println("All fruits " + fruits);

        //removing element
        fruits.remove(2);
        fruits.remove("Mango");
        System.out.println("Fruits after removing " + fruits);


        //size of an ArrayList
        System.out.println("Fruits are " + fruits.size());

        //Retrieve the elements at a given index
        String string1 = fruits.get(1);
        System.out.println("fruit at index 1 is " + string1);
        System.out.println("fruit at index 2 is " + fruits.get(2));

        //How to modify an element at given index
        fruits.set(2, "Third String");
        System.out.println(fruits);

        Collections.sort(fruits); //Asc order
        System.out.println("Ascending order " + fruits);
        Collections.reverse(fruits); //Desc order
        System.out.println("Descending order " + fruits);


        // clearing all
        fruits.clear();
        System.out.println("After clearing all fruits " + fruits);


    }
}

