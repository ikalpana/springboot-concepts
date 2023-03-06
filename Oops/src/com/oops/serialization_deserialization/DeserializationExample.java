package com.oops.serialization_deserialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
class DeserializationExample {
    public static void main(String[] args) {
        StudentInfo si = null;
        try {
            FileInputStream fis = new
                    FileInputStream("D:/Files/student.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            si = (StudentInfo) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Student Name : "+si.getName());
        System.out. println("Roll no : "+si.getrNo());
        System.out.println("Standard : "+si.getStandard());
    }
}

