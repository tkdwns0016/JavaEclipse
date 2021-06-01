package User;

import java.util.Scanner;

import Game.blackjack;

public class present extends blackjack{
	public blackjack run(blackjack user) {
		Scanner sc=new Scanner(System.in);
		//유저생성(테이블 없으니 객체생성)
		user.charge(user);
		return user;

	}
}
