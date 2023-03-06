package Files;

import java.io.File;

public class AbsolutePath {
	public static void main(String[] args) { 
		File myObj = new File("C:\\Users\\Kalpanai\\Documents\\Student.txt"); 
		if (myObj.exists()) { 
		System.out.println("File name: " + myObj.getName()); 
		System.out.println("Absolute path of the file:" + myObj.getAbsolutePath());                                          
		System.out.println("Writeable: " + myObj.canWrite()); 
		System.out.println("Readable " + myObj.canRead()); 
		System.out.println("File size in bytes " + myObj.mkdir()); 
		} else { 
		System.out.println("The file does not exist."); 
		}
	}

}
