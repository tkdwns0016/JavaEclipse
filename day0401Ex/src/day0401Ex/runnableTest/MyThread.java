package day0401Ex.runnableTest;

public class MyThread {
	private MyRunnable r;
	
	public MyThread(MyRunnable r) {
		this.r = r;
	}
	
	
	public void start() {
		r.run();
	}
	
	
}
