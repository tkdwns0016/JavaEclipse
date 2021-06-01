package Application;

import java.util.Scanner;

import Game.Game;
import Game.blackjack;
import User.Delete;
import User.product;

public class first {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CLS cls = new CLS();
		blackjack u = new blackjack();
		System.out.println("┌─────────────────────────────────────────────┐");
		System.out.println("│           블랙잭에 오신 여러분을 환영합니다!!!!      │");
		System.out.println("└─────────────────────────────────────────────┘");
		
			
			while(true) {

				System.out.println(">>> 메뉴를 선택해주세요 !!");
				System.out.println("1] 가입 및 탈퇴 ");
				System.out.println("2] 로그인");
				System.out.println("3] 종료");
				
			String msg;
			String choice = sc.nextLine();
			switch(choice) {
			case "1":
				cls.run();
				System.out.println(">>> 1] 회원가입");
				System.out.println(">>> 2] 회원탈퇴");
				msg = sc.nextLine();
				// 회원가입
				if (msg.equals("1")) {
					cls.run();
					System.out.println(">>> 회원가입을 선택하셨습니다.");
					u.signup();
					break;
				}
				// 회원탈퇴
				if (msg.equals("2")) {
					cls.run();
					System.out.println(">>> 회원 탈퇴를 선택하셨습니다.");
					u.delete(u);
					break;
				} else {
					cls.run();
					System.out.println(">>> 아무것도 선택을 하지 않으셨습니다.");
					System.out.println(">>> 초기메뉴로 돌아갑니다.");
					break;
				}
				
			case "2":
				System.out.println(">>> 로그인을 선택하셨습니다.");
				u.login(u);
				break;
			}
		
			try {
				if(!u.getId().equals(null)) {
					break;
					
				}
			} catch (NullPointerException e) {
				
			}
			}
			
			
			while (true) {
				System.out.println("1] 게임시작");
				System.out.println("2] 도움말");
				System.out.println("3] 조회");
				System.out.println("4] 충전 및 선물");
				System.out.println("5] 로그아웃");
				String choice2 = sc.nextLine();
				String msg2;
				
			switch (choice2) {
			case "1":
				cls.run();
				System.out.println(">>> 게임시작을 선택하셨습니다");
				Game game = new Game();
				game.run(u);
				break;
			case "2":
				cls.run();
				System.out.println(">>> 도움말을 선택하셨습니다");
				Help help = new Help();
				help.run();
				break;
			case "3":
				cls.run();
				System.out.println(">>> 정보를 조회합니다.");
				u.check(u);
				break;
			
			case "4":
				cls.run();
				System.out.println(">>> 충전 및 선물 메뉴에 들어오셨습니다.");
				System.out.println("1] 포인트 충전");
				System.out.println("2] 포인트 선물");
				
				msg2 = sc.nextLine();
				switch(msg2) {
				
				case "1":
					cls.run();
					u.charge(u);
					break;
					
				case "2":
					cls.run();
					u.present(u);
					break;
					
				}
			
			}
			if (choice2.equals("5")) {
				System.out.println("종료합니다.");
				break;
			}
		
	}
}
}
