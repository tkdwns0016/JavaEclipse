package day0401Ex.threadTest;

public class MyTestThread {
	public static void main(String[] args) {
		ThreadTest t1 = new ThreadTest("��",10);
		ThreadTest t2 = new ThreadTest("��", 1);
		
		System.out.println("�� ����");
		t1.start();
		System.out.println("�� ����");
		

		System.out.println("�� ����");
		t2.start();
		System.out.println("�� ����");
		
		
		
		
		
		
		
		
		
		
	}
}
