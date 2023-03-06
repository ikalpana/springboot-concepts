package com.oops.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {
    public static void main(String [] args) {
        List list = new ArrayList();
        list.add("element1");
        list.add(1);
        System.out.println("List 1 : "+list);

     //   String s = (String) list.get(1); //classCastException

        List<String> list1 = new ArrayList<String>();
        list1.add("element1");
      //  list1.add(1); //it throws compile time error

        System.out.println("List 2 : "+list1);
        String s1 = list1.get(0);
        System.out.println("Value at index 0 : "+s1 );


    }
}
