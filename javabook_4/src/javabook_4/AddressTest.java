package javabook_4;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class AddressTest {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		InetAddress Address = InetAddress.getLocalHost();
		System.out.println("로컬 컴퓨터의 이름: "+ Address.getHostName());
		System.out.println("로컬 컴퓨터의 IP주소: "+ Address.getHostAddress());
		Address = InetAddress.getByName("java.sun.com");
		System.out.println("java.sun.com 컴퓨터의 이름과 IP 주소: "+ Address);
		InetAddress all[] = InetAddress.getAllByName("www.daum.net");
		for(int i = 0; i < all.length; i++)
			System.out.println(all[i]);

	}

}
