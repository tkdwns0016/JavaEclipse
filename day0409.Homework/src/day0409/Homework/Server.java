package day0409.Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;



public class Server implements Runnable{
	Socket socket;	//소켓 변수 선언 해줌.
	BufferedReader br;	//BufferedReader타입 변수 선언해줌.
	PrintWriter pw;	//PrintWriter타입 변수 선언해줌.

	String user;	//문자열 변수 user선언해줌.
	HashMap<String, PrintWriter> hm;	//String부분에 user, 값엔 유저들의 PrintWriter가 들어간다함.
	//HashMap타입의 hm변수 선언해줌.
	InetAddress ip;	//InetAddress타입의 ip변수를 선언, 클라이언트의 ip를 알 수 있다.
	String msg;		//문자열 변수 msg선언.
	
	public Server(Socket socket,HashMap<String, PrintWriter> h) {
		//Socket과 HashMap을 파라미터로 받는 생성자를 만들어 줬다.
		this.socket = socket;	//필드 socket에 파라미터로 받은 socket을 대입한다~.
		hm = h;		//필드의 hm에 파라미터로 받은 h를 대입해줌.

		try {
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//br변수를 BufferedReader객체로 만들고,InputStreamReader객체를 인자로 받으며 
			//InputStreamReader의 인자에는 socket.getInputStream()을 호출한다.
			//socket.getInputStream() 으로 InputStream을 리턴하여 완료~
			pw = new PrintWriter(socket.getOutputStream());
			//PrintWriter객체를 생성할땐 socket.getOutputStream()를 이용한다.
			//OutputStream을 리턴하여 완료~

			user = br.readLine();
			//readLine하여 한줄의 문자열을 읽어서 user에 대입.
			//아이디를 입력받아서 넣는 과정이다.

			ip = socket.getInetAddress();
			//socket.getInetAddress() 를 통해서 클라이언트의 ip를 "문자열"로 받아 대입해준다.

			System.out.println(ip+"의 "+user+"님이 접속하였습니다.");	//대충 입장을 표시함.

			synchronized(hm) {//임계영역을 설정한다고 함. HashMap에 추가시 한 쓰레드만 들어와서 사용 가능하다고 함.
				//synchronized는 Thread가 각각 개인활동 하게끔 만들어준다하면 될듯하다.
				hm.put(user, pw);// hm의 키,값에 user와 pw를 넣어줌~
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void run() {
		String receiveData;	//문자열 변수 receiveData 선언해줌.

		try {
			while((receiveData = br.readLine()) !=null) {	
				//receiveData에 br.readLine으로 한줄씩 읽어 대입하면서
				//null이 아닐때까지 반복함.

				if(receiveData.equals("/quit")) {	//if로 탈출구 생성를 만들어줌, /quit입력시 탈출함.
					synchronized (hm) {	//임계영역을 설정한다고함, HashMap에 삭제시 한 쓰레드만 들어와서 사용 가능함.
						hm.remove(user);//HashMap에 키값이 user인 것을 삭제함. 아이디 삭제기능.
					}
					break;	//반복문 탈출함.
				}else {
					System.out.println(user+" > "+receiveData);//quit가 아니라면 모두에게 메시지 출력.
					broadcast(user+" >> "+receiveData);	
					//broadcast메소드로 보내 전체 소켓에 전송하여 모든사용자에게 메시지를 출력해준다.
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			synchronized (hm) {
				hm.remove(user);	
			}
			broadcast(user+"님이 퇴장하였습니다.");	//broadcast함수 호출할때 문자열 파라미터로 대입
			System.out.println(user+"님이 퇴장하였습니다.");// 그 유저가 퇴장시 아이디 표출하며 안내문 띄움.

			if(socket != null) {//socket값이 null, 즉 그 유저가 나가면
				try {
					br.close();//BufferedReader를 닫아줌.
					pw.close();//PrintWriter를 닫아줌.
					socket.close();//소켓을 닫아줌
				} catch (IOException e) {

					e.printStackTrace();
				}
			}
		}
	}

	public void broadcast(String msg) {
		synchronized (hm) {
			for(PrintWriter pw : hm.values()) {
				//HashMap에서 값만 빼서 pw라는 변수에 대입을 함.
				//null값이 나오기 전까지 계속해서 반복함.

				pw.println(msg);	//pw의 함수 println에 문자열을 넣음.
				//문자열이 pw에 담긴다!
				pw.flush();	//pw의 flush함수를 호출하여 pw에 담겨있던 문자열을 소켓을통해 전송하게 됨.
				//반복을 하면서 모든 연결된 소켓에 문자열을 전송하게 된다고 함.
			}
		}
	}
}
