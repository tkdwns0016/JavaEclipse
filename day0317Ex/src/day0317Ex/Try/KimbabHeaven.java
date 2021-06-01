package day0317Ex.Try;

import java.util.Scanner;

public class KimbabHeaven {
	public static void main(String[] args) {
		
		Ramen ramen = new Ramen("신라면");
		Kimbab kimbab = new Kimbab("야채김밥");
		Bokumbab bokumbab = new Bokumbab("김치볶음밥");
		Scanner w = new Scanner(System.in);
		
		Food[] food = new Food[3];
		food[0]=ramen;
		food[1]=kimbab;
		food[2]=bokumbab;
		System.out.println("몇명인가요?");
		int a = w.nextInt();
		if (a>=5) {
			while(true) {
			System.out.println("5인상 집합 금지입니다..!!!");}
		}
		for (int i = 0; i < a; i++) {
			System.out.println("1. 라면");
			System.out.println("2. 김밥");
			System.out.println("3. 볶음밥");
			System.out.println((i + 1) + "번째 사람은 무엇을 먹을겁니까");
			a = w.nextInt();
			
			switch (a) {
			case (1):
				Ramen ram = (Ramen)food[0];
				System.out.println(ram.getName() + "으로 주문했습니다.");
				ram.cooking();
				System.out.println("1.손으로 먹기 2.젓가락으로 먹기");
				a = w.nextInt();
				if (a == 1) {
					System.out.println(ram.eat1());
				} else {
					System.out.println(ram.eat2());
				}
				System.out.println("--------------");
				System.out.println();
				break;
			case (2):
				Kimbab kim = (Kimbab) food[1];
				System.out.println(kim.getName() + "으로 주문했습니다.");
				kimbab.cooking();
				System.out.println("1.손으로 먹기 2.젓가락으로 먹기");
				a = w.nextInt();
				if (a == 1) {
					System.out.println(kim.eat1());
				} else {
					System.out.println(kim.eat2());
				}
				System.out.println("--------------");
				System.out.println();
				break;
			case (3):
				Bokumbab bok = (Bokumbab) food[2];
				System.out.println(bok.getName() + "으로 주문했습니다.");
				bokumbab.cooking();
				System.out.println("1.손으로 먹기 2.젓가락으로 먹기");
				a = w.nextInt();
				if (a == 1) {
					System.out.println(bok.eat1());
				} else {
					System.out.println(bok.eat2());
				}
				System.out.println("--------------");
				System.out.println();
				break;
			}
		}
	}
}
