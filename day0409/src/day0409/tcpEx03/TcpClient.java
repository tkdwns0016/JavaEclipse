package day0409.tcpEx03;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClient {
	public static void main(String[] args) {
		try (Socket socket = new Socket("127.0.0.1",7777)){
		
		Thread w = new Thread(new TcpWriter(socket));
		w.start();
		
		w.join();//w쓰레드가 종료될때까지 기다린다.
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("클라이언트 종료");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
