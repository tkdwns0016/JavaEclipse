package day0317.abstractEx.ex01;

public class Test {
	public static void main(String[] args) {
		// Anical anical = new Animal(); 객체 생성이 불가능 하다.

		Lion lion = new Lion();
		lion.setName("야옹이");
		lion.bark();

		Dog dog = new Dog("댕댕이");
		dog.bark();

		Chicken chicken = new Chicken();
		chicken.bark();

		// 배열(같은 타입인 애들의 묶음)
		// 서로다른 타입은 부모로 묶어줄 수 있다.
		// 이것을 다형성이라함.
		Animal animal0 = new Lion();
		Animal animal1 = new Chicken();
		animal0.bark();
		animal1.bark();

		System.out.println("-----------");
		Animal[] animals = new Animal[3];
		animals[0] = lion;
		animals[1] = dog;
		animals[2] = chicken;
		for (Animal a : animals) {
			a.bark();
		}
		
		
		//이 메서드는 부모인 Animal에 정의 되어 있지 않기 때문에 사용할 수 없다.
		//animal[2].isFried();
		
		//다운캐스팅하여 자식자료형에 담으면 사용가능.
		Chicken c = (Chicken)animals[2];
		System.out.println(c.isFried());
		
		
		//cast 예외가 발생한다.
		//lion을 chicken으로 바꾸려해서이다.
		//Chicken c1 = (Chicken)animals[0]; 
		
		//부모 변수에 들어있는 객체의 실제 타입을 비교하는 키워드 instanceof
		if(animals[0] instanceof Chicken) {
			System.out.println(((Chicken)animals[0]).isFried());
		}
		
		
		
		
		
	}
}
