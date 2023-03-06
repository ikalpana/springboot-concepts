package com.oops.abstraction.example2;

public  abstract class AbstractClass {

    // Data member
    public int x = 10;

    //Constrcutor
    public AbstractClass(int x) {
        this.x = x;
    }

    //Instance Method
    public void instanceMethod() {
        System.out.println("Instance Method ");
    }

    //static method
    public static void staticMethod() {
        System.out.println("Static method");

    }

    //abstract method
    abstract void abstractMethod() ;



}
