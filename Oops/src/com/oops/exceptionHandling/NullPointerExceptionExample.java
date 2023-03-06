package com.oops.exceptionHandling;


public class NullPointerExceptionExample {

    public static void main(String [] args) {
        String string = null;

        try {
            System.out.println(string.length());
        }
        catch(NullPointerException e){
            System.out.println("String can't be null please enter a value:");

        }
    }
}
