package day0401.bankEx;

public class BankAccount {
	private int balance;
	
	//�Ա�
	public synchronized void deposit(int amount) {
		balance += amount;
	}
	
	//���
	public synchronized void whithraw(int amount) {
		balance -= amount;
	}
	
	//Ȯ��
	public int getBalance() {
		return balance;
	}
}
