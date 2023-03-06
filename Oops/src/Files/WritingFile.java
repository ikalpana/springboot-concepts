package Files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFile {

	public static void main(String[] args) {

		String addData = "This is the Data in Kalpana.txt file";
		try {
			FileWriter f = new FileWriter("D:\\Kalpana.txt");
			// adding data to file
			f.write(addData);
			// closing the write
			System.out.println("data added");
			f.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("An error " + e);
		}
	}
}
