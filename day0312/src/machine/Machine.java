package machine;

public class Machine {
	String brand;
	String name;
	int price;
	
	public Machine () {	}
	
	public Machine (String brand,String name,int price) {
		this.brand=brand;
		this.name=name;
		this.price=price;
	}
	
	
	
	public void printInfo () {
		System.out.print("브랜드와 기종은 "+brand+" "+name+"     가격 : "+price);
	}
}
