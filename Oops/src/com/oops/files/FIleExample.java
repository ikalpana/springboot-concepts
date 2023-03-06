package com.oops.files;

import java.io.*;
import java.util.Scanner;

public class FIleExample {

    public static void main(String args[]) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please select a number from given below \n 1 for writing to a file and 2 for reading the data in file");
        System.out.println("Enter a number..");
        int a = scan.nextInt();

        if (a == 1) {
            Scanner scan1 = new Scanner(System.in);
            System.out.println("Please enter the data to write in file:");
            String data = scan1.next();
            BufferedWriter output = null;
            scan1.close();

            try {
                FileWriter file = new FileWriter("D:/Files/WriteFile.txt");
                output = new BufferedWriter(file);

                // Writes the data to the file
                output.write(data);
                System.out.println("Data is written to the file.");

            } catch (IOException e) {
                e.getStackTrace();
            } finally {
                output.close();
            }
        }
        if(a == 2) {
            try {
                File obj = new File("D:/Files/WriteFile.txt");
                Scanner reader = new Scanner(obj);
                while (reader.hasNextLine()) {
                    String data = reader.nextLine();
                    System.out.println("Data in the file : "+data);
                }
                reader.close();
            } catch (FileNotFoundException e) {
                System.out.println("File not found!");
            }
        }
        scan.close();

    }

}
