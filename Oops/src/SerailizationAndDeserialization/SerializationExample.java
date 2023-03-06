package SerailizationAndDeserialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

class SerializationExample {
    public static void main(String[] args) {
        try {
            StudentInfo si = new StudentInfo("Name", 101, "Fifth");
            FileOutputStream file = new FileOutputStream("D:anjali.txt");
            ObjectOutputStream oos = new ObjectOutputStream(file);
            oos.writeObject(si);
            System.out.println("Data stored in the file");
            System.out.println("Student Name : " + si.getName());
            System.out.println("Roll no : " + si.getrNo());
            System.out.println("Standard : " + si.getStandard());
            oos.flush();
            oos.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
