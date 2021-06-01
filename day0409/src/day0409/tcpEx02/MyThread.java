package day0409.tcpEx02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyThread extends Thread {
	public MyThread(Socket socket, BufferedReader br, BufferedWriter bw) {
		this.socket = socket;
		this.br = br;
		this.bw = bw;
	}

	public void sending(String str) {
		try {

			if(str.equals("exit")) {
				this.bw.write("상대방이 나가셨습니다.");
				bw.flush();
			}else {
				bw.write(str+'\n');
				bw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void run() {
		try {

			String msg;
			msg = br.readLine();
			System.out.println(">>> "+msg);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	}
}

