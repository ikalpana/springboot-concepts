package Files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadingFile {
	public static void main(String[] args) {
		File f = new File("D:\\Kalpana.txt");

		try {
			Scanner r = new Scanner(f);

			if (r.hasNextLine()) {
				String nextLine = r.nextLine();
				System.out.println("Data in the file :-" + nextLine);
			}

			r.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("An error " + e);
		}
	}
}
