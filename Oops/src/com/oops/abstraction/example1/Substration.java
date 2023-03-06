package com.oops.abstraction.example1;

public class Substration extends Calculation{
    @Override
    void calculate(int a, int b) {
        int c = a -b;
        System.out.println("Substration of "+ a +" and "+ b + " is "+c);
    }
}
