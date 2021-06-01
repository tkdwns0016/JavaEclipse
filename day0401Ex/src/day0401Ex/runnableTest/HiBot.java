package day0401Ex.runnableTest;

public class HiBot {
	public static void main(String[] args) {
		MyRunnable r1 = new ExCount();
		
		MyThread c1 = new MyThread(r1);
		
		c1.start();
			
	}
}
