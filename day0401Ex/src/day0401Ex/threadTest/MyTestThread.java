package day0401Ex.threadTest;

public class MyTestThread {
	public static void main(String[] args) {
		ThreadTest t1 = new ThreadTest("√ ",10);
		ThreadTest t2 = new ThreadTest("∂Ø", 1);
		
		System.out.println("√  Ω√¿€");
		t1.start();
		System.out.println("√  ¡æ∑·");
		

		System.out.println("∂Ø Ω√¿€");
		t2.start();
		System.out.println("∂Ø ¡æ∑·");
		
		
		
		
		
		
		
		
		
		
	}
}
