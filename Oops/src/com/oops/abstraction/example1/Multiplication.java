package com.oops.abstraction.example1;

public class Multiplication extends Calculation{
    @Override
    void calculate(int a, int b) {
        int c = a * b;
        System.out.println("Multiplication of "+ a +" and "+ b + " is "+c);

    }
}
