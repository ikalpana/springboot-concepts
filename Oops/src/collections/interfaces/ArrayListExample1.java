package collections.interfaces;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample1 {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Hyderabad", "Banglore", "Vizag", "Mumbai", "Pune");

        //basic for loop
        System.out.println("Using for loop");
        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i));
        }
        //Enhanced for each loop
        System.out.println("using for each loop");
        for (String City : cities) {
            System.out.println(City);
        }
        //basic loop with iterator
        System.out.println("using loop with iterator");
        for (Iterator iterator = cities.iterator(); iterator.hasNext(); ) {
            String city = (String) iterator.next();
            System.out.println(city);
        }
        // iterator with while loop
        System.out.println("using iterator with while loop");
        Iterator<String> iterator = cities.iterator();
        while (iterator.hasNext()) {
            String city = iterator.next();
            System.out.println(city);
        }

    }
}

