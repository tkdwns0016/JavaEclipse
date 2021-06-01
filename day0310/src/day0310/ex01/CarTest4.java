package day0310.ex01;

public class CarTest4 {
	public static void main(String[] args) {
		// 메서드 사용
		Car car= new Car();
		car.color= "검정";
		car.mileage = 10000;
		
		// 변수명.메서드명();
		car.start();
		System.out.println("마일리지:"+car.mileage);
		
		car.go(); // 마일리지를 증가 시킴
		System.out.println("증가 후 마일리지: "+car.mileage);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
