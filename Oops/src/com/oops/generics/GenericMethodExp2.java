package com.oops.generics;

public class GenericMethodExp2 {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Manisai", "Devasani", "manisai@gmail.com", "Hyderbad", 60000);

        Employee empArry[] = new Employee[1];
        empArry[0] = employee1;
        display(empArry);

        Integer[] intArray = {10, 20, 30, 40, 50};
        display(intArray);


    }

    //Generic method
    private static <E> void display(E[] elements) {
        for (E e : elements) {
            System.out.println(e);
        }

    }
}
