package com.oops.encapsulation.example1;

class Area {

    // fields to calculate area
    public int length;
    public int breadth;
    public int radius;

    // constructor to initialize values
    public Area(int length, int breadth, int radius) {
        this.length = length;
        this.breadth = breadth;
        this.radius = radius;
    }

    // method to calculate area of rectangle
    public void areaOfRectangle() {
        int area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    //method to calculate area of circle
    public  void areaOfCirle() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of circle: " + area);
    }
}
