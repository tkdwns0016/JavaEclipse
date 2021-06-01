package day0402.urlEx01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ex01 {
	public static void main(String[] args) {
		//ip 나 host를 관리하는 클래스 이다.
		InetAddress ip = null;
		
		try {
			ip = InetAddress.getByName("www.naver.com");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		System.out.println(ip);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
