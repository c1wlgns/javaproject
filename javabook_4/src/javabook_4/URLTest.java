package javabook_4;
import java.net.*;

public class URLTest {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		URL kbs = new URL("http://www.kbs.co.kr/aboutkbs/history.html");
		System.out.println("��������: "+ kbs.getProtocol());
		System.out.println("��Ʈ: "+ kbs.getPort());
		System.out.println("ȣ��Ʈ: "+ kbs.getHost());
		System.out.println("����(�������): "+ kbs.getFile());
		System.out.println("��ü: "+ kbs.toExternalForm());

	}

}
