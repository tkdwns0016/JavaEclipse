package day0409.Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;


public class TcpClient {
	String ipAddress = "127.0.0.1";	//문자열 변수 ipAdddress 선언해줌.
	static final int port=7777;	//static은 이 클래스 내에서 static변수는 항상 같은 값을 사용함. 
	//final은 불변의 값으로써 값이 선언된 후에 변경 불가 함. 
	Socket socket = null;	//소켓 변수를 선언하고 null값 초기화.
	BufferedReader br;	//BufferedReader의 변수 br선언
	PrintWriter pw;	//PrintWriter의 변수 pw선언
	BufferedReader bfr;	//BufferedReader의 변수 bfr 선언해줌
	String sendData;	//문자열 변수 sendData 선언 , 보낼 메시지를 담을 것임.
	String receiveData;	//문자열 변수 receiveData 선언 , 보낼 메시지를 담을것임.
	String user;	//문자열 변수 user 선언 , 아이디를 변수에 대입할 것임.
	TcpReader tr;	//ReceiveDataThread변수 rdt를 선언 
	boolean endflag=false;	//참거짓 변수 endflag선언 후 false로 초기화함.

	public TcpClient(String id) {	//TcpClient생성자로 id와 ip를 받는다.
		user = id;	// user(아이디)에 id를 대입.

		try {
			System.out.println("***** 클라이언트 *****");	
			socket = new Socket(ipAddress, port);	//소켓 객체 socket에  ip주소와 포트번호 넣어 소켓객체 생성.

			br = new BufferedReader(new InputStreamReader(System.in));
			// BufferedReader 객체를 생성하여 InputStreamReader를 인자로 받고 System.in을 인자로 받아서 br에 대입한다.

			bfr = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//  BufferedReader 객체를 생성하여 InputStreamReader를 인자로 받고 소켓객체의 getInputStream()을 인자로 받아서 bfr에 대입한다.

			pw = new PrintWriter(socket.getOutputStream());
			//pw변수에 PrintWriter객체를 생성하여 socket.getOutputStream()인자를 받아 대입한다.

			pw.println(user);	// pw(PrintWriter)에 user(문자열)을 담아준다.
			pw.flush();			// flush 함수를 호출하여 pw에 담겨있던 문자열을 Socket을 통해 전송.
			
			tr = new TcpReader(socket, bfr);//TcpReader객체 를 쓰레드로 만들것이고, 파라미터로 소켓과 bfr객체를 넣어줌.

			Thread t = new Thread(tr);//쓰레드 객체를 생성해 파라미터(인자)로 tr객체를 넣어줌.

			t.start();	//쓰레드 t객체에 tr객체를 인자로 사용했기에 Runnable을 사용한 TcpReader클래스에
			// run메서드를 실행시킴.
			while(true) {
				sendData = br.readLine();	// br객체는 System.in이기에 사용자의 키보드 입력을 받아 sendData에 대입.
				pw.println(sendData);	//사용자가 작성한 sendData문자열을 PrintWriter객체에 담아줌.
				pw.flush();//PrintWriter객체에 담긴 문자열을 Socket을 통해 전송.

				if(sendData.equals("/quit")) {
					endflag = true;	//참거짓 변수 endflag에 true를 대입하여
					break;	//반복문을 탈출함.
				}
			}
			System.out.println("클라이언트"+user+"의 접속을 종료합니다.");//퇴장할때 안내문.
			System.exit(0); //프로그램 종료 함수. ***
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bfr.close();
				pw.close();
				socket.close();
				System.exit(0);
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//스캐너 유틸 생성
		System.out.println("아이디를 입력하세요 : ");
		String user = sc.next();
		new TcpClient(user);
	}
}
