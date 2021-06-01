package day0405_0408.tcpEx01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MyTcpClient {
	public static void main(String[] args) {
//		접속할 ip주소와 접속할 포트번호를 넣고 소켓객체를 생성
		System.out.println("서버소켓에 연결");

		try (Socket socket = new Socket("192.168.1.42", 7979);
				// 서버쪽 소켓과 연결된 소켓에서 inputStream을 가져옴
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "utf-8"));
				// 서버쪽 소켓과 연결된 소켓에서 outputStream을 가져옴
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "utf-8"))) {
			Scanner sc = new Scanner(System.in);
			System.out.println("서버와 연결이 됨.");
			while (true) {
				String msg = br.readLine();
				System.out.println("서버로 부터 읽은 메시지 : " + msg);
				String talk = sc.next();
				bw.write(talk + "\n");// 끝에 꼭 \n개행을 해줘야함. readLine으로 읽기 때문.
				bw.flush();
//			msg = br.readLine();
//			System.out.println("서버로 부터 읽은 메시지2 : "+msg);
				if (talk.equals("exit")) {
					break;
				}
			}
			System.out.println("클라이언트 종료.");

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
