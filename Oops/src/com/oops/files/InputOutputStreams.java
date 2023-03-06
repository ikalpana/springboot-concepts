package com.oops.files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class InputOutputStreams {
    public static void main(String[] args) {

        int data1 = 5;
        String data2 = "This is data in the file";

        try {
            FileOutputStream file = new FileOutputStream("D:/Files/WriteFile.txt");
            ObjectOutputStream output = new ObjectOutputStream(file);
            output.writeInt(data1);
            output.writeObject(data2);

            FileInputStream fileStream = new FileInputStream("D:/Files/WriteFile.txt");
            ObjectInputStream objStream = new ObjectInputStream(fileStream);

            //Using the readInt() method
            System.out.println("Integer data :" + objStream.readInt());

            // Using the readObject() method
            System.out.println("String data: " + objStream.readObject());

            output.close();
            objStream.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
