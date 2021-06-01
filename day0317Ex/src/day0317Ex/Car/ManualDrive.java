package day0317Ex.Car;

public class ManualDrive extends Car{
	
	
	public ManualDrive(String name) {
		super(name);
	}

	
	
	public void startCar() {
		System.out.println(name+"차키를 넣어 시동을 겁니다.");
	}
	
	
	public void drive() {
		System.out.println("손으로 핸들을 움직여 운전을 합니다.");
	}
	
	
	public void stop() {
		System.out.println("브레이크를 밟아 멈춥니다.");
	}
	
	public void turnOff() {
		System.out.println("차키를 돌려 시동을 끕니다.");
	}
	
	
	
	
	
	
	
	
	
	
}
