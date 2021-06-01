package day0401.threadEx01;

public class CountTest {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			System.out.println(i+"초");
			
			try {
				Thread.sleep(1000);//1초씩 잠재움.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("초 종료");
		for (int i = 1; i < 10; i++) {
			System.out.println(i+"땡");
			
			try {
				Thread.sleep(1000);//1초씩 잠재움.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("땡 종료");
	}
}
