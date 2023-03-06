package com.oops.abstraction.example3;

public class MainClass extends Employee{

    public MainClass(String name, int id) {
        super(name, id);
    }
    public static void main(String[] args) {
        MainClass mainClass = new MainClass("Name", 1);
        mainClass.instanceMethod();

    }
}
