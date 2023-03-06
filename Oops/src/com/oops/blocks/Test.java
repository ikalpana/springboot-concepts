package com.oops.blocks;

public class Test extends superClass {
    private static final long serialVersionUID = 1L;

    static {
        System.out.println("Inside of static block from subclass");
    }

    {
        System.out.println("Inside of an instance block from subclass");
    }

    public Test() {
        super();
        System.out.println("Inside of the constructor from subclass ");
    }

    public static void staticMethod() {
        System.out.println("Inside of an static method from subclass ");
    }

    public static void main(String[] args) {
        Test test = new Test();
        staticMethod();
        test.nonStaticMethod();
        superClass superClass = new Test();
        superClass.nonStatic();
        staticMethod1();
        System.out.println("static field " + serialVersionUID);
    }

    public void nonStaticMethod() {
        System.out.println("Inside of non-static method from subclass");
    }


}

class superClass {

    static {
        System.out.println("Inside of static block from Superclass");

    }

    {
        System.out.println("Inside of non-static block from superClass");

    }

    public superClass() {
        super();
        System.out.println("Inside of the constructor from superclass");

    }

    public static void staticMethod1() {
        System.out.println("Inside static method of superClass");
    }

    public void nonStatic() {
        System.out.println("Inside of non-static method from superclass");
    }

}
