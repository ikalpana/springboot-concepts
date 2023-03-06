package Files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class OutputStreamWriterExample {
	public static void main(String[] args) {
		try {
		 OutputStream outputStream = new FileOutputStream("D:Kalpana.txt");  
         Writer outputStreamWriter = new OutputStreamWriter(outputStream);  

         outputStreamWriter.write("Hi Anjali How are you");  
         System.out.println("print");

         outputStreamWriter.close();  
     } catch (Exception e) {  
         e.getMessage();  
     
     }
	}
}
