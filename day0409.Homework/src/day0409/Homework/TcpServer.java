package day0409.Homework;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class TcpServer {
	int port = 7777;	//정수 선언하여 안에 포트번호 7777을 대입해줌.
	ServerSocket ss = null;	//서버소켓타입 변수 선언 후 null값 대입해줌.
	Socket socket = null;	//소켓타입 변수 선언 후 null값 대입
	HashMap<String, PrintWriter> hm;//컬렉션인 HashMap타입의 키값을 String, 값은 PrintWriter로 받는 hm 변수를 선언.
	public TcpServer() {	//TcpServer 생성자
		try {
			Server sv;	//ChatServerThread 타입의 cst 변수를 선언하였음, [브로드 캐스팅]이란것을 하기 위한 쓰레드 객체 라고 한다.
			Thread t;				//Thread 타입의 변수 t 선언해줌.	[브로드 캐스팅]이란 한 지점에서 여러지점으로의 데이터 전송을 의미한다. 
			ss = new ServerSocket(port);
			System.out.println("클라이언트의 접속을 기다립니다.");//클라이언트 접속 대기 표시.
			hm = new HashMap<String, PrintWriter>();	//HashMap객체를 생성해서 hm 변수를 대입

			while(true) {
				//서버소켓의 변수인 ss를 이용하여 accept함수 호출로 클라이언트 접속까지 대기.
				//접속시 클라이언트의 소켓을 연결해줌.
				socket = ss.accept();
				if(socket != null) {	//소켓타입 변수 socket값이 null이 아닐 시 실행.
					sv = new Server(socket,hm);
					t = new Thread(sv);
					t.start();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} //서버소켓을 생성하여 ss변수에 대입.

	}
	public static void main(String[] args) {
		new TcpServer();	//TcpServer 객체 생성 해서 시작하면 바로 생성자 속의 소스 실행.
	}
}
