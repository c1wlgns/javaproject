package javabook_3;
import java.io.*;

public class FileDirTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1 = new File("C:/log.txt");
		System.out.println("���� �̸�: "+ f1.getName());
		System.out.println("���� �̸�: "+ f1.getPath());
		System.out.println("���� ���: "+ f1.getAbsolutePath());
		System.out.println(f1.exists()? "���� ����" : "���Ͼ���");
		System.out.println(f1.canWrite()? "���� ����" : "�����Ұ���");
		System.out.println(f1.canRead()? "�б� ����" : "�б� �Ұ���");
		System.out.println(f1.isDirectory()? "���͸�" : "���͸� �ƴ�");
		System.out.println(f1.isFile()? "����" : "���Ͼƴ�");
		System.out.println(f1.isAbsolute()? "���� ���" : "���� ��� �ƴ�");
		System.out.println("1970�� 1�� 1�� ���� ������ ������ ������ ��¥������ �и���: "+ f1.lastModified());
		System.out.println("����ũ��: "+ f1.length() + "Bytes");

	}

}
