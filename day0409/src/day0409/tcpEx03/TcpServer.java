package day0409.tcpEx03;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class TcpServer {
	public static void main(String[] args) {
		ServerSocket ss;
		try {
			Socket socket = new Socket();
			ss = new ServerSocket(7777);	//ServerSocket객체에 포트번호를 입힘.
			System.out.println("클라이언트 접속 대기중...");
			
			socket = ss.accept();	//ss.accept명령어로 상대방의 접속을 기다리고,
									//Socket 객체에 ServerSocket에 입힘
			
			System.out.println("클라이언트와 접속하였습니다");
			
			Thread w = new Thread(new TcpWriter(socket));	// Thread w객체를 생성하여 파라미터에 TcpWriter생성자를 넣고
															// 그 생성자파라미터에 소켓을 넣음.
			System.out.println("시작!");
			w.start();	// Thread w객체에 입혀진 TcpWriter가 Runnable을 사용하고 있기에
						// Tcp클래스의 run 메서드를 실행하기위해 w.start()메서드를 실행. 
			
			w.join();	// w.start메서드가 끝나기를 기다림.
			System.out.println("서버 종료");
		}catch (IOException e) {
			System.out.println("서버 종료");
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
