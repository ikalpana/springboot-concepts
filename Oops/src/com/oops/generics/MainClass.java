package com.oops.generics;
class GenericBounded<T extends Number> {
    T data;

    GenericBounded(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void display() {
        System.out.println("Data value is : " + this.data);
    }

}

public class MainClass {
    public static void main(String[] args) {
    	GenericBounded<Integer> obj = new GenericBounded<>(30);
        obj.display();
        GenericBounded<Double> obj1 = new GenericBounded<>(33.3);
        obj1.display();
        GenericBounded<Float> obj2 = new GenericBounded<>(33.33f);
        obj2.display();
    }
}
