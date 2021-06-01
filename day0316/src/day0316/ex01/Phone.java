package day0316.ex01;

public class Phone {
	private String brand;
	private int price;
	private String name;
	
	//생성자 (브랜드, 가격 , 단말기 이름)
	public Phone (String brand,	int price, String name) {
		this.brand = brand;
		this.price = price;
		this.name = name;
	}
	
	//필드의 값을 가져오는 메서드
	public String getBrand() {
		return brand;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getName() {
		return name;
	}
	
	
}
