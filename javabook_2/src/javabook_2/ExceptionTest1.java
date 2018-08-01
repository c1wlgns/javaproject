package javabook_2;
import java.io.*;

public class ExceptionTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			FileReader fle = new FileReader("a.txt");
			int i;
			while((i = fle.read()) != -1)
				System.out.println((char)i);
			fle.close();
		}catch(Exception e) {
			System.out.println("에외 처리된 루틴: "+ e + "파일이 존재하지 않는다.");
		}

	}

}
