package collections.interfaces;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeExample {
    public static void main(String[] args) {
        ArrayDeque<String> animals = new ArrayDeque<>();

        // Using add()
        animals.add("Dog");

        // Using addFirst()
        animals.addFirst("Cat");

        // Using addLast()
        animals.addLast("Horse");

        // Using offer()
        animals.offer("Lion");
        animals.offer("Parrot");
        animals.offer("Parrot");

        // Using offerFirst()
        animals.offerFirst("Tiger");

        // Using offerLast()
        animals.offerLast("Crocodile");
        System.out.println("ArrayDeque: " + animals);

        // Get the first element
        String firstElement = animals.getFirst();
        System.out.println("First Element: " + firstElement);

        // Get the last element
        String lastElement = animals.getLast();
        System.out.println("Last Element: " + lastElement);

        // Using peek()
        String element = animals.peek();
        System.out.println("Head Element: " + element);

        // Using peekFirst()
        String firstElement1 = animals.peekFirst();
        System.out.println("First Element: " + firstElement1);

        // Using peekLast
        String lastElement2 = animals.peekLast();
        System.out.println("Last Element: " + lastElement2);

        // Using remove()
        String element1 = animals.remove();
        System.out.println("Removed Element: " + element1);

        System.out.println("New ArrayDeque: " + animals);

        // Using removeFirst()
        String firstElement2 = animals.removeFirst();
        System.out.println("Removed First Element: " + firstElement2);

        // Using removeLast()
        String lastElement3 = animals.removeLast();
        System.out.println("Removed Last Element: " + lastElement3);

        // Using poll()
        String element2 = animals.poll();
        System.out.println("Removed Element: " + element2);
        System.out.println("New ArrayDeque: " + animals);

        // Using pollFirst()
        String firstElement4 = animals.pollFirst();
        System.out.println("Removed First Element: " + firstElement4);

        // Using pollLast()
        String lastElement5 = animals.pollLast();
        System.out.println("Removed Last Element: " + lastElement5);

        System.out.print("ArrayDeque: ");

        // Using iterator()
        Iterator<String> iterate = animals.iterator();
        while (iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }

        System.out.print("\nArrayDeque in reverse order: ");
        // Using descendingIterator()
        Iterator<String> desIterate = animals.descendingIterator();
        while (desIterate.hasNext()) {
            System.out.print(desIterate.next());
            System.out.print(", ");
        }
    }
}
