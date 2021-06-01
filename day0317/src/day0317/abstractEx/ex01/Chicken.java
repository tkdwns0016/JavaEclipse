package day0317.abstractEx.ex01;

public class Chicken extends Animal {

	
	public Chicken() {
		name= "양념치킨";
	}
	
	
	@Override
	public void bark() {
		System.out.println(name+": 꼬끼오");
	}
	
	
	public boolean isFried() {
		return false;
	}
	
	

}
