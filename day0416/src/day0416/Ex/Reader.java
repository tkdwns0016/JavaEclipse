package day0416.Ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;


public class Reader implements Runnable{
	Socket socket;
	String naver;
	BufferedReader br;
	
	public Reader(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while((naver = br.readLine()) !=null) {
				System.out.println(naver);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
