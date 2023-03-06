package collections.interfaces.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListExample3 {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee(1, "Manisai","Devasni", "manisai@gmail.com", "Hyderabad", 80000));
        employeeList.add(new Employee(2, "Saipavan","Kumar", "saipavan@gmail.com", "Hyderabad", 50000));
        employeeList.add(new Employee(3, "kalpana","ithagoni", "kalpana@gmail.com", "Hyderabad", 60000));
        employeeList.add(new Employee(4, "Ram","Penti", "ram@gmail.com", "Hyderabad", 70000));

        Collections.sort(employeeList, new Mysort()); //Ascending order
        for (Employee employee : employeeList) {
            System.out.println(employee.getFirstName());
        }


    }
}

class Mysort implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getSalary() - o2.getSalary();
    }
}
