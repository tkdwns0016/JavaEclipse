package day0312.inheritance.ex01;

public class CarTest {
	public static void main(String[] args) {
		
		Car car01 = new Car();
		car01.color = "검정";
		car01.mileage = 100;
		
		System.out.println(car01.getInfo());
		car01.sppedUp();
		System.out.println(car01.getInfo());
		
		System.out.println("-----스포츠카-----");
		SportsCar sportsCar01 = new SportsCar();
		sportsCar01.color = "빨강";
		sportsCar01.mileage= 0;
		sportsCar01.sppedUp();
		sportsCar01.turbo = true;
		System.out.println(sportsCar01.getInfo());
	}
}