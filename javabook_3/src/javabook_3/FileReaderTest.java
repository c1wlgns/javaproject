package javabook_3;
import java.io.*;

public class FileReaderTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader(args[0]);
		int i;
		while((i = fr.read()) != -1 ) {
			System.out.println((char)i);
		}
		fr.close();

	}

}
