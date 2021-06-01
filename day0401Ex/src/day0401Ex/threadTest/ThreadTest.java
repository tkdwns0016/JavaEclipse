package day0401Ex.threadTest;

public class ThreadTest extends Thread{
	private String str;
	private int n;
	public ThreadTest(String str,int n) {
		this.str = str;
		this.n=n;
	}
	
	
	public void run() {
		
		
				for(int i = n; i != 11-n;) {
			if (n<6) {
				i++;
			}else{
				i--;
			}
			System.out.println(i+str);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}


