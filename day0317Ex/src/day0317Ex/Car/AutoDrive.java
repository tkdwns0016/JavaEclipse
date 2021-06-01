package day0317Ex.Car;

public class AutoDrive extends Car{
	
	
	public AutoDrive (String name) {
		super(name);
	}
	


	public void startCar() {
		System.out.println(name+"스타트버튼으로 시동을 겁니다.");
	}
	
	
	public void drive() {
		System.out.println("자율주행으로 운전을 합니다.");
	}
	
	
	public void stop() {
		System.out.println("자동으로 차가 멈춥니다.");
	}
	
	public void turnOff() {
		System.out.println("스타트버튼으로 시동을 끕니다.");
	}
	
	
	
	
	
}
