package javabook_4;
import java.net.*;

public class UDPSender {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DatagramSocket ds = new DatagramSocket();
		InetAddress ia = InetAddress.getByName(args[0]);
		int port = Integer.parseInt(args[1]);
		byte buffer[] = args[2].getBytes();
		DatagramPacket dp = 
				new DatagramPacket(buffer, buffer.length, ia, port);
		ds.send(dp);

	}

}
