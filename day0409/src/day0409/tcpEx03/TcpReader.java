package day0409.tcpEx03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;


public class TcpReader implements Runnable{
	private Socket socket;
	
	public TcpReader(Socket socket) {
		this.socket = socket;
	}
	
		public void run() {
		try(BufferedReader br = new BufferedReader(
				new InputStreamReader(socket.getInputStream()))){
			String msg = "";
			while(true) {
				msg = br.readLine();
				if(msg == null) {
					System.out.println("서버 종료");
					break;
				}
				System.out.println(">>> "+msg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
}