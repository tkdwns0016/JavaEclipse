package day0405.udpEx01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReceiver {
	public static void main(String[] args) {
		//udp 받기
		try {
			//데이터그램 소켓을 포트번호를 넣어 만듦. (택배를 받을 집.)
			DatagramSocket socket = new DatagramSocket(7777);
			
			//수신데이터를 저장할 빈 배열 준비. (상자에 넣을 내용물)
			byte[] buf = new byte[1024];
			
			//수신할 데이터가 저장될 빈 패킷도 준비. ( 내용물을 넣을 상자.)
			DatagramPacket packet = new DatagramPacket(buf, buf.length);
			
			//소켓을 통해 수신 (문앞에서 대기)
			System.out.println("데이터 수신 대기중...");
			socket.receive(packet);
			
			System.out.println("수신 끝.");
			
			//받은 데이터를 열어보자.
			System.out.println("받은 데이터 : "+new String(buf).trim());//.trim() 불필요한 부분은 잘라라는 의미.
			
			
			
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
