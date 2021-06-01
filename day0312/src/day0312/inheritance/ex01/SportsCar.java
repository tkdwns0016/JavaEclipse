package day0312.inheritance.ex01;

public class SportsCar extends Car {
	boolean turbo;
	
	// 부모의 메서드를 덮어쓰는 것을 메서드의 오버라이드.
	//@Override를 어노테이션 코드의 오류를 방직하기위해 알려주는 역활
	@Override
	String getInfo() {
		//super.
		String str = super.getInfo();
		str += ",   turbo : "+turbo;
		return str;
	}
	
	
	
	
	
	
	
}
