package Application;

import java.util.Scanner;

public class Help {
	public void run() {
		Scanner sc=new Scanner(System.in);
		CLS cls=new CLS();

		while(true) {
			System.out.println(">>> 메뉴를 선택해주세요");
			System.out.println("1] 블랙잭 도움말");
			System.out.println("2] 배팅 규칙");
			System.out.println("3] 랭킹");
			System.out.println("4] 이전메뉴");


			String msg=sc.nextLine();
			switch(msg) {
			case "1":
				System.out.println(">>> 블랙잭 설명 Rule ====");
				System.out.println("1. 플레이어와 딜러 간의 대결입니다.");
				System.out.println("2. 21에 가까운 쪽이 승리합니다.");
				System.out.println("3. 숫자 A는 1과 11로 계산합니다");
				System.out.println("4. [J],[Q],[K]는 숫자 10으로 통일합니다");
				System.out.println("5. 딜러는 16전에는 숫자를 받으나 16이 넘으면 카드받지 않습니다.");
				System.out.println(">>> 5초뒤 메뉴로 돌아갑니다.");

				try {
					Thread.sleep(4000);
					cls.run();

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				break;

			case "2":
				System.out.println(">>> 배팅  ");
				System.out.println("1. 배팅은 판당 $3,000원 ");
				System.out.println("2. 승리할시 2배를, 패배시 배팅한 돈을 잃습니다.");
				System.out.println(">>> 5초뒤 메뉴로 돌아갑니다");
				try {
					Thread.sleep(4000);
					cls.run();

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				break;
			case "3":
				System.out.println("┌────────────────────[랭킹시스템]───────────────────────┐");
				System.out.println("│"+">>> 랭킹 시스템                                                                           │");
				System.out.println("│"+"[  브론즈    ] : $150,000 미만                                                 │");
				System.out.println("│"+"[   실버     ] : $150,000 이상       ~ $200,000 미만               │");
				System.out.println("│"+"[   골드     ] : $200,000 이상      ~ $300,000 미만                │");
				System.out.println("│"+"[  플래티넘  ] : $300,000 이상      ~ $500,000 미만                │");
				System.out.println("│"+"[ 다이아몬드 ] : $500,000 이상      ~ $1,000,000 미만            │");
				System.out.println("│"+"[그랜드마스터] : $1,000,000 이상   ~ $2,000,000 미만           │");
				System.out.println("│"+"[  챌린저    ] : $2,000,000 이상                                             │");
				System.out.println("└────────────────────────────────────────────────────┘");
				System.out.println(">>> 5초뒤 메뉴로 돌아갑니다");
				try {
					Thread.sleep(4000);
					cls.run();

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				break;
				
			}
			if(msg.equals("4")) {
				cls.run();
				break;
			}
		}
	}
}

