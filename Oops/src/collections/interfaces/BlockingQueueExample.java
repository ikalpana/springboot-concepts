package collections.interfaces;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample {

    public static void main(String[] args) {
        BlockingQueue<Integer> numbers = new ArrayBlockingQueue<>(5);

        try {
            // Insert element to blocking queue
        	numbers.put(4);
            numbers.put(2);
            numbers.put(1);
            numbers.put(3);
            numbers.put(5);
            System.out.println("BlockingQueue: " + numbers);

            // Remove Elements from blocking queue
            int removedNumber = numbers.take();
            System.out.println("Removed Number: " + removedNumber);
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
