package javabook_3;
import java.io.*;

public class FileWriterTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String source = "����־�� ��μ� ������ ���� ���\n" 
		+ "������ ����Ѵٴ� ����\n" + "����� �������� ��ħ�� �´� �ٴ� ���Դϴ�.\n";
		char input[] = new char[source.length()];
		source.getChars(0, source.length(), input, 0);
		FileWriter fw = new FileWriter(args[0]);
		fw.write(input);
		fw.close();

	}

}
