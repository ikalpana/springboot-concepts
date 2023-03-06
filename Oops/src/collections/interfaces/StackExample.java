package collections.interfaces;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();

        // Add elements to Stack
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");
        System.out.println("Stack elements: " + animals);

        // Remove element from  stack
        String element = animals.pop();
        System.out.println("Removed Element: " + element);

        // Access element from the top
        String element1 = animals.peek();
        System.out.println("Element at top: " + element1);

        // Search an element
        int position = animals.search("Horse");
        System.out.println("Position of Horse: " + position);

        // Check if stack is empty
        boolean result = animals.empty();
        System.out.println("Is the stack empty? " + result);
    }
}
