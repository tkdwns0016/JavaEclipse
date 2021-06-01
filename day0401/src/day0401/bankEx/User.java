package day0401.bankEx;

public class User implements Runnable{

	BankAccount account;
	
	public User(BankAccount account) {
		this.account = account;
	}
	
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			account.deposit(10000);
			try {
				Thread.sleep(99);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			account.whithraw(10000);
			System.out.println("ÀÜ°í : "+account.getBalance());
		}
	}
	
}
