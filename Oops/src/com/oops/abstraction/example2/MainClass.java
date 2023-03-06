package com.oops.abstraction.example2;

public class MainClass extends AbstractClass{

    public MainClass(int x) {
        super(x);
    }
    @Override
    void abstractMethod() {
        System.out.println("Abstract Method");
    }

    public static void main(String [] args) {
        MainClass mainClass = new MainClass(10);
        mainClass.instanceMethod();
        mainClass.abstractMethod();
        staticMethod();
        System.out.println("Public variable X = " + mainClass.x);


    }
}
