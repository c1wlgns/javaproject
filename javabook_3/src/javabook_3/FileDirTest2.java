package javabook_3;
import java.io.*;

public class FileDirTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1 = new File("C:/log.txt");
		System.out.println("파일 이름: "+ f1.getName());
		System.out.println("파일 이름: "+ f1.getPath());
		System.out.println("절대 경로: "+ f1.getAbsolutePath());
		System.out.println(f1.exists()? "파일 존재" : "파일없음");
		System.out.println(f1.canWrite()? "수정 가능" : "수정불가능");
		System.out.println(f1.canRead()? "읽기 가능" : "읽기 불가능");
		System.out.println(f1.isDirectory()? "디렉터리" : "디렉터리 아님");
		System.out.println(f1.isFile()? "파일" : "파일아님");
		System.out.println(f1.isAbsolute()? "절대 경로" : "절대 경로 아님");
		System.out.println("1970년 1월 1일 부터 파일이 마지막 수정된 날짜까지의 밀리초: "+ f1.lastModified());
		System.out.println("파일크기: "+ f1.length() + "Bytes");

	}

}
