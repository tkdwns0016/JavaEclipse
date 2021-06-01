package day0409.Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.Socket;

public class TcpReader implements Runnable {
	Socket socket;	//소켓 변수 socket 선언해줌
	BufferedReader br;	//BufferedReader 의 br변수 선언.
	String receiveData;	//문자열 변수 receiveData 선언.

	public TcpReader(Socket socket,BufferedReader br) {
		this.socket = socket;	//필드 socket에 파라미터 socket을 대입
		this.br = br;	//필드 br에 파라미터 br대입
	}

	public void run() {
		try{
			while((receiveData = br.readLine()) != null) {	//null이 아니면 계속 문자열을 읽어 넣어줌.
				System.out.println(receiveData);	//읽은 문자열을 출력해줌.
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();	//br객체를 닫아줌.
				socket.close();// socket객체를 닫아줌.
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}