package com.oops.generics;

import java.util.Arrays;
import java.util.List;

public class GenericUpperBoundExp4<T> {
    public static void main(String[] args) {

        //List of Integers
        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Sum of the numbers " + sum(ints));

        //List of Doubles
        List<Double> doubles = Arrays.asList(1.5d, 2d, 3d);
        System.out.println("Sum of the double digits " + sum(doubles));

//        List<String> strings = Arrays.asList("1","2");
//         System.out.println(sum(strings));
        //This will give compilation error as :: The method sum(List<? extends Number>) in the
        //type GenericsExample<T> is not applicable for the arguments (List<String>)

    }

    //Method will accept
    private static Number sum(List<? extends Number> numbers) {
        double s = 0.0;
        for (Number n : numbers)
            s += n.doubleValue();
        return s;
    }
}
