package day0401.raceEx;

public class Racing {
	public static void main(String[] args) {
		
		Horse h1 = new Horse("일번마");
		Thread t1 = new Thread(h1);
		Horse h2 = new Horse("이번마");
		Thread t2 = new Thread(h2);
		Horse h3 = new Horse("삼번마");
		Thread t3 = new Thread(h3);
		
		t1.start();
		t2.start();
		t3.start();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
