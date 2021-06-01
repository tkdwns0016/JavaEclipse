package day0310.ex01;

public class CarTest {
	public static void main (String[] args) {
		//클래스를 잉용하여 Car객체를 생성해보자.
		//Car(자료)형의 변수를 생성
		Car car1;
		
		// car1 변수에 객체를 생성하여 넣어주자.
		car1 = new Car();
		// 생성된 객체의 필드에 값을 넣어주자.
		car1.color = "검정";
		car1.mileage= 1000;
		
		//객체안에 있는 내용을 출력해보자.
		System.out.println("car1.color : " + car1.color);
		System.out.println("car1.mileage : " + car1.mileage);
		
		
		
		
		
		
		
		
		
		
		
	}
}
