package day0401.threadEx01;

public class MyThread extends Thread{
	private String str;//필드, 멤버변수
	
	//생성자.
	public MyThread(String str) {
		this.str = str;
	}
	
	//병렬을 처리하기 위해서 구현해야하는 메서드.
	//run 메서드를 재정의 해야한다. 얘가 시행되면 하나의 쓰레기가 더 생겨서 실행한다.
	@Override
	public void run() {
		//1~9까지 1씩 카운트.
		for(int i = 1; i <10 ; i++) {
			System.out.println(i+str);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	
	
}
