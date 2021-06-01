package day0312.inheritance.ex01;

public class Car {
	int speed;
	int mileage;
	String color;

	void sppedUp() {
		speed +=10;
	}
	
	void speedDown() {
		speed -=10;
	}
	
	
	String getInfo() {
		
		return "speed : " + speed+", mileage : " +mileage +", color : "+ color;
	
	}

}
