package day0401.threadEx01;

public class CountTest {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			System.out.println(i+"��");
			
			try {
				Thread.sleep(1000);//1�ʾ� �����.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("�� ����");
		for (int i = 1; i < 10; i++) {
			System.out.println(i+"��");
			
			try {
				Thread.sleep(1000);//1�ʾ� �����.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("�� ����");
	}
}
