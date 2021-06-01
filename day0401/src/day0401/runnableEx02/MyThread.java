package day0401.runnableEx02;

public class MyThread {
	private MyRunnable r;
	
	public MyThread(MyRunnable r) {
		this.r = r;
	}
	
	public void start() {
		r.run();
	}
	
	
	
}
