package javabook_3;
import java.io.*;

public class ObjectReadTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("tmp.txt"));
		String s2 = (String)ois.readObject();
		Box mybox2 = (Box)ois.readObject();
		System.out.println(s2);
		System.out.println("박스의 가로는: "+ mybox2.w);
		System.out.println("박스의 세로는: "+ mybox2.h);
		System.out.println("박스의 높이는: "+ mybox2.d);
		System.out.println("Double의 값은: ");

	}

}
