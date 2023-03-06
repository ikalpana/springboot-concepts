package com.oops.abstraction.example1;

public class Addition  extends Calculation{

    @Override
    void calculate(int a, int b) {
        int c = a+b;
        System.out.println("Sum of "+ a +" and "+ b + " is "+c);
    }
}
