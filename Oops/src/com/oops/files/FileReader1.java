package com.oops.files;

import java.io.FileReader;
import java.nio.charset.Charset;

class FileReader1 {
    public static void main(String[] args) {

        char[] array = new char[100];
        try {

            FileReader input = new FileReader("D:/Files/WriteFile.txt");
            input.read(array);
            System.out.println("Data in the file: ");
            System.out.println(array);

            // Returns the character encoding of the file reader
            System.out.println("Character encoding of input1: " + input.getEncoding());
            input.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
