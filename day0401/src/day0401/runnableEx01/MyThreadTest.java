package day0401.runnableEx01;

public class MyThreadTest {
	public static void main(String[] args) {
		//Runnable �� ������ Ŭ������ �����带 ������� ��� �ؾ��ϴ°�.
//		MyThread myT1 = new MyThread("��");
		Runnable myT1 = new MyThread("��");
		
		Thread t1 = new Thread(myT1);
		
		t1.start();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
