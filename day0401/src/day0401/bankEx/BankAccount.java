package day0401.bankEx;

public class BankAccount {
	private int balance;
	
	//입금
	public synchronized void deposit(int amount) {
		balance += amount;
	}
	
	//출금
	public synchronized void whithraw(int amount) {
		balance -= amount;
	}
	
	//확인
	public int getBalance() {
		return balance;
	}
}
