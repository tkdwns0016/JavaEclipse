package day0401.threadEx01;

public class MyThreadTest {
	public static void main(String[] args) {
		//�����带 �̿��Ͽ� ī��Ʈ �غ���!
		Thread t1 = new MyThread("��");
		
		//start()�� ȣ���ϸ� �����尡 �ϳ� ���ܼ� run()�� �����ϰԵ�
		t1.start();
		System.out.println("�� ����!");
		
		Thread t2 = new MyThread("��");
		t2.start();
		System.out.println("�� ����!");
		
		
		
		
		
		
		
		
		
		
	}
}
