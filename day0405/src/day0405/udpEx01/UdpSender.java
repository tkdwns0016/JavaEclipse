package day0405.udpEx01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class UdpSender {
	public static void main(String[] args) {
		try {
			Scanner user = new Scanner(System.in);
			System.out.println("아이피 주소를 입력해주세요");
			String userIp = user.next();
			//목적지를 내 아이피로 해보았다.
			InetAddress ip = InetAddress.getByName(userIp);//InetAddress는 ip관련된 일을 함.
			System.out.println("보낸 아이피 주소 : "+userIp);
			//udp는 datagram 소켓을 이용하여 보낸다.
			DatagramSocket socket = new DatagramSocket();
			
			//보낼 데이터를 바이트 배열로 준비
			String msg = "안녕하세요! 내 문자를 받아라!!";
			//문자열을 getBytes()로 이용하여 바이트 배열로 반환 받는다.
			byte[] buf = msg.getBytes();
			
			//준비된 데이터를 보내기 위해
			//목적지의 포트번호, 아이피주소, 데이터
			//데이터를 datagram패킷으로 묶어 보낸다.
			//(보낼 데이터의 바이트배열,배열길이,아이피주소,포트번호)
			DatagramPacket packet = new DatagramPacket(buf, buf.length,ip,7777);
			
			//소켓을 통해 데이터를 전송한다.(택배기사 같은 느낌) 
			socket.send(packet);
			
			System.out.println("데이터 전송 끝!");
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
	}
}
