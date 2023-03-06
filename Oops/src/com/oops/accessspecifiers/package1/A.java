package com.oops.accessspecifiers.package1;

public class A {

    //Global variables (static, instance)
    public String name = "packages"; //public member
    public static String name1 = "classes"; //public static member
    protected int i = 10; //protected member
    int j = 99; //default member
    private double b = 2.2; //private member

    public static void print() {
        //local variable
        int k = 10;
        System.out.println("Local variable in side of method: "+k);
    }

        public static void main(String[] args)
        {
            A a1 = new A();
            System.out.println(a1.i);
            System.out.println(a1.j);
            System.out.println(a1.name);
            System.out.println(a1.b);
            System.out.println(name1);
            print();
        }
    }