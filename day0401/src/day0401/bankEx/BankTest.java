package day0401.bankEx;

public class BankTest {
	//°øÀ¯ÇÒ ¹ğÅ© °èÁÂ
	static BankAccount account = new BankAccount();
	
	public static void main(String[] args) {
		User u1 = new User(account);
		Thread t1 = new Thread(u1);
		Thread t2 = new Thread(new User(account));
		
		t1.start();
		t2.start();
	}
	
}
