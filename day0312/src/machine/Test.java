package machine;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int sel;
		int q;
		char w;
		double dist;
		
		Phone ph = new Phone();
		Car car = new Car();
		
		Scanner v = new Scanner(System.in);
		System.out.println("1번은 핸드폰사용자, 2번은 자동차운전자");
		sel=v.nextInt();
		
		switch(sel) {
		case 1:
			ph.call();
			System.out.println("브랜드를 입력해주세요");
			ph.brand=v.next();
			System.out.println("기종을 입력해주세요");
			ph.name=v.next();
			System.out.println("가격을 적어주세요");
			ph.price=v.nextInt();
			System.out.println("용량을 적어주세요");
			ph.storage=v.nextInt();
			ph.printInfo();
			break;
		case 2:
			System.out.println("차종을 입력해주세요.");
			car.carType=v.next();
			System.out.println("몇인승인인지 입력해주세요.");
			car.seater=v.nextInt();
			car.printInfo();
			
			System.out.printf("차를 이용하시겠습니까?  (Y or N)");
			w=v.next().charAt(0);
			if(w=='Y') {
				car.startUp();
				System.out.printf("출발하시겠습니까?  (Y or N)");
				w=v.next().charAt(0);
				if(w=='Y') {
					car.go();
					System.out.println("가야할 거리를 저장해주세요");
					dist=v.nextInt();
					car.dist(dist);
					while(true) {
					System.out.printf("속도를 조절하시겠습니까?  (U or D)");
					w=v.next().charAt(0);
					if(w=='U') {
						car.speedup();
					}else {
						car.speeddown();
						}
					System.out.printf("속도를 조절하시겠습니까?  (U or D)");
					w=v.next().charAt(0);
					if(w=='U') {
						car.speedup();
					}else {
						car.speeddown();
					}
					
					}	
				}
		
			}
		}
	}
}
	
