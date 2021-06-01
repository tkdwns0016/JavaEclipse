package day0316.ex01;

public class Person {
	private String name;
	private int age;
	private Phone phone;
	
	
	public Person (String name, int age, Phone phone) {
		this.name=name;
		this.age=age;
		this.phone=phone;
	}
	
	
	//데이터를 반환해주는 메서드
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public Phone getPhone () {
		return phone;
	}
	
	@Override
	public String toString() {
		return "이름 : "+name+", 나이 : "+age+", 브랜드"+phone.getBrand()+
				", 단말기가격 : "+phone.getPrice()+", 단말기명 : "+phone.getName();
	}
	
	
	
	
}
