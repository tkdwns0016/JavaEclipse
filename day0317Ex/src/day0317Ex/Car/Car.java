package day0317Ex.Car;

public abstract class Car {
	protected String name;
	
	public Car(String name) {
		this.name = name;
	}
	
	protected abstract void startCar();		
	protected abstract void drive();		
	protected abstract void stop();		
	protected abstract void turnOff();
	
	//final 이 메서드는 상속받은 클래스가 변경할 수 없음. Override를 못하게 막음
	public final void run () {
		startCar();
		drive();
		stop();	
		turnOff();
	}
}
