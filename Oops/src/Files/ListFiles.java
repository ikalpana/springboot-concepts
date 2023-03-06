package Files;

import java.io.File;

public class ListFiles {
	public static void main(String[] args) {
		File file = new File("D:/react");
		// returns an array of all files
		String[] fileList = file.list();
		System.out.println("FIles in the folder ");
		for (String str : fileList) {
		System.out.println(str);
		}
		}
}
