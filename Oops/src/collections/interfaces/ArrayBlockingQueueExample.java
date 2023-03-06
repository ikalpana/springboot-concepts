package collections.interfaces;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueExample {

    public static void main(String[] args) {
        ArrayBlockingQueue<String> animals = new ArrayBlockingQueue<>(10);

        // Add elements
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        System.out.println("ArrayBlockingQueue: " + animals);

        // Using peek()
        String element = animals.peek();
        System.out.println("Accessed Element: " + element);

        // Using iterator()
        Iterator<String> iterate = animals.iterator();
        System.out.print("ArrayBlockingQueue Elements: ");

        while (iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }

        // Using remove()
        String element1 = animals.remove();
        System.out.println("Removed Element:");
        System.out.println("Using remove(): " + element1);
        System.out.println(animals);
        // Using poll()
        String element2 = animals.poll();
        System.out.println("Using poll(): " + element2);
        System.out.println(animals);
        // Using clear()
        animals.clear();
        System.out.println("Updated ArrayBlockingQueue: " + animals);
    }
}
