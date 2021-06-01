package day0409.tcpEx03;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class TcpWriter implements Runnable {
	private Socket socket;
	public TcpWriter(Socket socket) {
		this.socket = socket;
	}


	public void run() {
		try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()))){

			//reader 기능이 있는 아이를 쓰레드로 만듦.
			TcpReader r = new TcpReader(socket);
			Thread readerThread = new Thread(r);
			//쓰레드를 데몬쓰레드로 만든다.
			//쓰레드를 만든 부모스레드가 종료되면 같이 종료된다.
			readerThread.setDaemon(true);
			readerThread.start();//쓰레드 시작.
			
			Scanner sc = new Scanner(System.in);
			String msg = "";
			while(true) {
				msg = sc.nextLine();
				bw.write(msg);
				bw.newLine();
				bw.flush();
				if(msg.equals("quit")) {
					break;
				}
			} 
			System.out.println("종료");
		}catch(IOException e){
			e.printStackTrace();
		}

	}
}
