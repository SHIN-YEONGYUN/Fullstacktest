package chap16;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPtest {

	public static void main(String[] args) {
		try {
			// www.naver.com - > (ip address + port) --> 이름-제안-인터넷국제기구등록
			InetAddress[] ip = InetAddress.getAllByName("www.naver.com");
			for (InetAddress i : ip) {
				System.out.println(i.getHostAddress());
			}
			InetAddress me = InetAddress.getLocalHost();
			System.out.println("-=-=-=-=-=-=");
			System.out.println(me.getHostAddress());
			System.out.println(me.getHostName());
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
