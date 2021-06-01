package day0409.tcpEx02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class MyTecpClientUseWhile{
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			try {
						
				Socket socket = new Socket("127.0.0.1",7777);
				System.out.println("접속 성공");
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
