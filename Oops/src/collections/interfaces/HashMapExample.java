package collections.interfaces;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Manisai","Devasni", "manisai@gmail.com", "Hyderabad", 80000);
        Employee employee2 = new Employee(2, "Saipavan","Kumar", "saipavan@gmail.com", "Hyderabad", 50000);
        Employee employee3 = new Employee(3, "kalpana","ithagoni", "kalpana@gmail.com", "Hyderabad", 60000);
        Employee employee4 = new Employee(4, "Ram","Penti", "ram@gmail.com", "Hyderabad", 70000);
        Map<String, Employee> map = new HashMap<String, Employee>();
        map.put("Digital", employee1);
        map.put("HR", employee2);
        map.put("Data", employee3);
        map.put("Digital", employee4);

        System.out.println("List of employees : "+map);


    }

    }
