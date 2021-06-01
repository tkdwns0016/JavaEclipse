package day0416.Ex;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Writer implements Runnable{
	Socket socket;
	BufferedWriter bw;
	Scanner sc = new Scanner(System.in);
	public Writer(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		try {
			String str="";
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while(true) {
				str = sc.nextLine();
				bw.write(str);
				bw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}