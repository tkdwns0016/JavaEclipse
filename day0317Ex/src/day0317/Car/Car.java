package day0317.Car;

public abstract class Car {
	
	protected String name;
	
	public void motion() {
		System.out.println(name+"가(이) 시동을 걸었습니다");
		work();
		move();
		work();
		System.out.println(name+"가(이) 시동을 껐습니다");
	}
	
	
	protected abstract void work();
	protected abstract void move();
	
	
	
	
	
	
	
}
