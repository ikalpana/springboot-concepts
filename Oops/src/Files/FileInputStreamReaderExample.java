package Files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import javax.imageio.stream.FileImageInputStream;

public class FileInputStreamReaderExample {

	public static void main(String[] args) {
		try {
			InputStream f = new FileInputStream("C:\\Users\\Kalpanai\\Documents\\Student.txt");
			Reader r = new InputStreamReader(f);
			int read = r.read();
			while (read != -1) {
				System.out.print((char) read);
				read = r.read();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
