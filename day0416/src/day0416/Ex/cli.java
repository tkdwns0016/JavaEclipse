package day0416.Ex;


import java.io.IOException;
import java.net.Socket;

public class cli {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("127.0.0.1",7777);
			
			Reader reader = new Reader(socket);
			Thread tr = new Thread(reader);
			
			tr.start();
			
			Writer writer = new Writer(socket);
			Thread tw = new Thread(writer);
			
			tw.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
