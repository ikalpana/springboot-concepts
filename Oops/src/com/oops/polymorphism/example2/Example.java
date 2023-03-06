package com.oops.polymorphism.example2;

public class Example {

    public void display() {
        for (int i = 0; i < 10; i++) {
            System.out.print("*");
        }
    }

    public void display(String symbol) {
        for (int i = 0; i < 10; i++) {
            System.out.print(symbol);
        }
    }
}
