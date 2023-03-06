package com.oops.generics;

import java.util.ArrayList;

public class MyCustomList<T> {

    ArrayList<T> list = new ArrayList<>(); //Generic type

    public void addElement(T element) {
        list.add(element);
    }

    public void removeElement(T element) {
        list.remove(element);
    }

    public T get(int index) {
        return list.get(index);
    }

    @Override
    public String toString() {
        return "MyCustomList{" +
                "list=" + list +
                '}';
    }
}
