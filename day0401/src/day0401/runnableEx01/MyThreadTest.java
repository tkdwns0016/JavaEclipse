package day0401.runnableEx01;

public class MyThreadTest {
	public static void main(String[] args) {
		//Runnable 을 구현한 클래스로 스레드를 만들려면 어떻게 해야하는가.
//		MyThread myT1 = new MyThread("초");
		Runnable myT1 = new MyThread("초");
		
		Thread t1 = new Thread(myT1);
		
		t1.start();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
