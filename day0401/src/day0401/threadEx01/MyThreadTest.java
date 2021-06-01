package day0401.threadEx01;

public class MyThreadTest {
	public static void main(String[] args) {
		//스레드를 이용하여 카운트 해보자!
		Thread t1 = new MyThread("초");
		
		//start()를 호출하면 스레드가 하나 생겨서 run()을 실행하게됨
		t1.start();
		System.out.println("초 종료!");
		
		Thread t2 = new MyThread("땡");
		t2.start();
		System.out.println("땡 종료!");
		
		
		
		
		
		
		
		
		
		
	}
}
