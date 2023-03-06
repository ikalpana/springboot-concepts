package com.oops.exceptionHandling;

import java.util.Scanner;

class IndexOutOfBoundsExceptionExample {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the String..");
        String string = scan.next();
        System.out.println("Enter the character index..");
        int index = scan.nextInt();

        for (int chance = 5; chance >= 1; chance--) {
            try {
                char ch = string.charAt(index);
                System.out.println("character ch : " + ch + " is present at index : " + index);
                break;
            } catch (StringIndexOutOfBoundsException e) {
                if (chance == 1) {
                    System.out.println("LAst attempt also failed..index  is not obtained,so program will be forcefully terminated");
                } else {
                    System.out.println("String index is out of range..");
                    System.out.println("You have " + (chance - 1) + " atttempts left");
                    System.out.println("Re-enter the proper index..");
                    index = scan.nextInt();

                }
            }
        }

    }
}

