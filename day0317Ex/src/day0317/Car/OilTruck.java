package day0317.Car;

public class OilTruck extends Car{

	public OilTruck() {
		name="OilTruck";
	}
	
	
	public void work() {
		System.out.println("기름을 보냅니다");
	}
	
	public void move() {
		System.out.println("다른지역으로 이동합니다.");
	}
	
}
