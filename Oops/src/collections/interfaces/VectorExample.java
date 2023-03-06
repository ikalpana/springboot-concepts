package collections.interfaces;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorExample {


    public static void main(String[] args) {
        Vector<String> animals = new Vector<>();

        // Using the add() method
        animals.addElement("Dog");
        animals.addElement("Horse");

        // Using index number
        animals.add(2, "Cat");
        System.out.println("List of Animals : " + animals);
        // Using addAll()
        Vector<String> animals1 = new Vector<>();
        animals1.add("Crocodile");

        animals1.addAll(animals);
        System.out.println("New list of Animals : " + animals1);
        // Using get()
        String Animal = animals1.get(2);
        System.out.println("Animal at index 2: " + Animal);

        // Using iterator()
        Iterator<String> iterate = animals1.iterator();
        System.out.print("Animals: ");
        while (iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }

        // The method subList(int fromIndex, int toIndex)
        List subList = animals1.subList(1, 3);

        System.out.println("Sub list elements :");
        for (int i = 0; i < subList.size(); i++) {
            System.out.println(subList.get(i));
        }
        // Using remove()
        String element = animals1.remove(1);
        System.out.println("Removed Element: " + element);
        System.out.println("New main List: " + animals1);

        //finding capacity of vector
        System.out.println("Capacity of vector is :" + animals1.capacity());

        //finding hashcode
        System.out.println("Hash code is " + animals1.hashCode());

        // inserting 20 at the index 4
        animals1.insertElementAt("Lion", 3);
        System.out.println("After insertion :" + animals1);

        // Using clear()
        animals1.clear();
        System.out.println("main list after clear: " + animals1);
    }
}
