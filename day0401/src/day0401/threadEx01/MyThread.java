package day0401.threadEx01;

public class MyThread extends Thread{
	private String str;//�ʵ�, �������
	
	//������.
	public MyThread(String str) {
		this.str = str;
	}
	
	//������ ó���ϱ� ���ؼ� �����ؾ��ϴ� �޼���.
	//run �޼��带 ������ �ؾ��Ѵ�. �갡 ����Ǹ� �ϳ��� �����Ⱑ �� ���ܼ� �����Ѵ�.
	@Override
	public void run() {
		//1~9���� 1�� ī��Ʈ.
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
