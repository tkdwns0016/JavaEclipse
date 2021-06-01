package day0316.ex01;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Phone p1 = new Phone ("애플",1350000,"아이폰XR");
		Phone p2 = new Phone ("삼성",1200000,"갤럭시S10");
		Phone p3 = new Phone ("김첨지폰",2750000,"머털도사");
		
		
		Person kim = new Person ("김상준",26,p2);
		Person jeong = new Person ("정사람",24,p1);
		Person park = new Person ("박첨지",75,p3);
		
		
		System.out.println("이름 : "+kim.getName()+", 단말기 이름 : "+kim.getPhone().getName());
		System.out.println("이름 : "+jeong.getName()+", 단말기 이름 : "+jeong.getPhone().getName());
		System.out.println("이름 : "+park.getName()+", 단말기 이름 : "+park.getPhone().getName());
		System.out.println("---------------------------------------");
		System.out.println();
		
		
		System.out.println("이름 : "+kim.getName()+", 단말기 가격 : "+kim.getPhone().getPrice());
		System.out.println("이름 : "+jeong.getName()+", 단말기 가격 : "+jeong.getPhone().getPrice());
		System.out.println("이름 : "+park.getName()+", 단말기 가격 : "+park.getPhone().getPrice());
		System.out.println("---------------------------------------");
		System.out.println();
		
		
		int avg=(kim.getPhone().getPrice()+jeong.getPhone().getPrice()+park.getPhone().getPrice())/3;
		System.out.println("각 사람의 폰가격의 평균 :  "+avg);
		System.out.println("---------------------------------------");
		System.out.println();
		
		
		if(kim.getPhone().getPrice()>jeong.getPhone().getPrice()) {
			if(kim.getPhone().getPrice()>park.getPhone().getPrice()) {
				System.out.println("이름 : "+kim.getName()+"\t"+kim.getAge());
			}
		}else if (jeong.getPhone().getPrice()>park.getPhone().getPrice()) {
			System.out.println("이름 : "+jeong.getName()+"\t"+jeong.getAge());
		}else System.out.println("이름 : "+park.getName()+"\t"+park.getAge());
		System.out.println("---------------------------------------");
		System.out.println();
		
		Scanner s = new Scanner(System.in);
		System.out.println("Person No. ( 1, 2, 3 )");
		int i = s.nextInt();
		switch(i) {
		case(1):
			System.out.println(kim);
		break;
		case(2):
			System.out.println(jeong);
		break;
		case(3):
			System.out.println(park);
		break;
		}
		System.out.println("종료");
		
		
		
		
		
		
		
	}
}
