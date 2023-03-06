package com.oops.accessspecifiers.package1;


public class B {
    public static void main(String[] args) {
        A a1 = new A();
        System.out.println(a1.i); // Within same package the protected member is accessed.
        System.out.println(a1.j); // default member is accessed in same package only

        System.out.println(a1.name); //public member is accessed in same packages and different packages
//           System.out.println(a1.b);
        //b is private variable it cannot be accessed in another class so this statement shows an error

    }
}
