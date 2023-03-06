package com.oops.generics;

import java.util.Arrays;
import java.util.List;

class GenericsLowerBoundExp5 {
    public static void main(String[] args) {
        
        //Lower Bounded Integer List
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);

        //Integer list object is being passed
       System.out.println("First list : "+list1);

        //Number list
        List<Number> list2 = Arrays.asList(4, 5, 6, 7);

        //Integer list object is being passed
        System.out.println("Second list : "+list2);
        SuperClass(list2);
    }

    public static void SuperClass(List<? super Integer> list) {
        System.out.println(list);
    }
}
