package javabook_2;
import java.io.*;

public class ExceptionTest2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileReader fle = new FileReader("a.txt");
		int i;
		while((i = fle.read()) != -1)
			System.out.println((char)i);
		fle.close();

	}

}
