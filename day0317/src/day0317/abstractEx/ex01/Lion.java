package day0317.abstractEx.ex01;

public class Lion extends Animal{
	//Abstract 클래스를 상속 받으면 빨간색 줄이 나옴.
	//추상 클래스를 상속받은 클래스는 반드시 추상메서드를 구현해야한다.
	//또는 자기자신이 추상클래스가 되면된다.
	//The type Lion must implement the inherited abstract method Animal.bark()
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public void bark() {
		System.out.println("어흥!!");
	}
	
	
	
	
	
	
	
}
