package day0401.raceEx;

public class Racing {
	public static void main(String[] args) {
		
		Horse h1 = new Horse("�Ϲ���");
		Thread t1 = new Thread(h1);
		Horse h2 = new Horse("�̹���");
		Thread t2 = new Thread(h2);
		Horse h3 = new Horse("�����");
		Thread t3 = new Thread(h3);
		
		t1.start();
		t2.start();
		t3.start();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
