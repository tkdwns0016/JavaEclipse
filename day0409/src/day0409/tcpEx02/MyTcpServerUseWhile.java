package day0409.tcpEx02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class MyTcpServerUseWhile{
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			ServerSocket serverSocket = new ServerSocket(7777);
			System.out.println("접속 대기중...");
			Socket socket = serverSocket.accept();
			
			System.out.println("클라이언트 - "+socket.getInetAddress());
			System.out.println("접속 성공...");
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			MyThread myt = new MyThread(socket, br, bw);
			while(true) {
			
			String str = sc.nextLine();
			myt.start();
			myt.sending(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
