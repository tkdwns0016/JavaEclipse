package day0401.runnableEx01;

public class MyThread extends Parent implements Runnable{
	
	public MyThread(String name) {
		super(name);
	}
	
	
	@Override
	public void run() {
		for(int i = 10; i>0; i--) {
			System.out.println(i+name);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
