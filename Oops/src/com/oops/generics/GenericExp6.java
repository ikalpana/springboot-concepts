package com.oops.generics;

import java.util.ArrayList;

public class GenericExp6{
    public static void main(String[] args) {
        ArrayList<Employee1> list = new ArrayList<Employee1>();
        Employee1 employee01 = new Employee1("Employee01", 10, 500000);
        Employee1 employee02 = new Employee1("Employee02", 11, 550000);
        list.add(employee01);
        list.add(employee02);
        for (Employee1<String> employee1 : list) {
            System.out.println(employee1);
        }
    }
}
