package com.oops.exceptionHandling;

import java.util.Scanner;

class ArithmeticExceptionExample  {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st number..");
        int a =scan.nextInt();
        System.out.println("Enter 2nd number..");
        int b = scan.nextInt();
        try
        {
            System.out.println(a/b);
        }
        catch (ArithmeticException e1)
        {
            System.out.println("Denominator cannot be zero. Re-enter the value.");
            b = scan.nextInt();
            try
            {
                System.out.println(a/b);
            }
            catch (ArithmeticException e2)
            {
                System.out.println("Re-Attempt failed..Program  will be terminated.");
            }
        }
        finally
        {
            scan.close();
            System.out.println("Scanner connection cloesd Successfully");
        }

    }
}
