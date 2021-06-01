package day0405_0408.tcpEx01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MyTcpServer {
	public static void main(String[] args) {
		// tcp의 서버

		Socket socket = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			// 1.서버 소켓 생성 , 접속받을 포트를 넣어서 만든다.
			System.out.println("서버 소켓 생성");
			ServerSocket serverSocket = new ServerSocket(1234);

			// 서버소켓의 accept() 요청을 받을 때까지 대기.
			System.out.println("요청 대기중");
			socket = serverSocket.accept();

			// 클라이언트와 연결된 소켓으로 인풋스트림과 아웃풋스트림을 가져온다.
			System.out.println("인풋스트림과 아웃풋 스트림을 받아온다.");
			// socket.getInputStream(); 로 클라이언트와 연결된 inputStream을 가져옴.
			// inputStreamReader를 통해 inputStream을 reader로 변경함.
			// BufferedReader로 가공한것.
			br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "utf-8"));
			// socket.getOutputStream()으로 클라이언트와 연결된 OutputStream을 가져옴.
			// OuputStreamWriter로 가공.( Output -> writer )하고 , 그걸 BufferedWriter로 가공한다.
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "utf-8"));
			while (true) {
				Scanner sc = new Scanner(System.in);
				// 클라이언트에게 메시지 보내기.
				String talk = sc.next();
				bw.write(talk);
				bw.flush();
				String msg = br.readLine();// '\n'가 있는곳까지 읽어냄.
				System.out.println("클라이언트에게 받은 메세지 : " + msg);
				if (talk.equals("exit")) {
					break;
				}
			}
			System.out.println("서버 종료.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				} // reader 닫기
				if (bw != null) {
					bw.close();
				} // writer 닫기
				if (socket != null) {
					socket.close();
				} // socket 닫기
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
