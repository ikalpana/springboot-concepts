package com.oops.accessspecifiers.package2;

import com.oops.accessspecifiers.package1.A;

public class C extends A {

    public static void main(String[] args) {
        C c1 = new C();
        System.out.println(c1.i); // protected can accessible in different package with import statement and to subclasses
//           System.out.println(a1.j);
        /* it will shows an error because
         the default member is not accessed in the another package we
         can access it in the same package only */
        System.out.println(c1.name); // public
        //   System.out.println(a1.b);
        // The private member is accessed in within the class

    }
}
