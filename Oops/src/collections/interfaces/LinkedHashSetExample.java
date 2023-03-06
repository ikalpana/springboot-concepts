package collections.interfaces;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> lhset = new LinkedHashSet<String>();

        // Adding elements to the LinkedHashSet
        lhset.add("Z");
        lhset.add("PQ");
        lhset.add("N");
        lhset.add("O");
        lhset.add("KK");
        lhset.add("FGH");
        System.out.println(lhset);

        // Calling the iterator() method
        Iterator<String> iterate = lhset.iterator();

        System.out.print("LinkedHashSet using Iterator: ");

        // Accessing elements
        while (iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
        // Using the remove() method
        boolean value1 = lhset.remove(5);
        System.out.println("\nIs 5 removed? " + value1);

        boolean value2 = lhset.removeAll(lhset);
        System.out.println("Are all elements removed? " + value2);
    }


}

