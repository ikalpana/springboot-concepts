package com.oops.abstraction.example1;

public class MainClass {

    public static void main (String [] args) {
        int a = 10;
        int b = 5;
        Addition addition = new Addition();
        Substration substration = new Substration();
        Multiplication multiplication = new Multiplication();
        addition.calculate(a, b);
        substration.calculate(a, b);
        multiplication.calculate(a, b);
    }
}
