package User;

import java.util.Scanner;

import Game.blackjack;

public class Delete {
	public void run() {
		Scanner sc=new Scanner(System.in);
		//유저생성(테이블 없으니 객체생성)
		blackjack u1=new blackjack();
		u1.delete(u1);

		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}