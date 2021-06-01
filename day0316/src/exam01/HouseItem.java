package exam01;

public class HouseItem {
	String name;
	int piece;
	int price;
	int total;
	
	
	public HouseItem (String name, int piece,int price) {
		this.name=name;
		this.piece=piece;
		this.price=price;
	}
	
	String getName() {
		return name;
	}
	
	
	public int getPrice() {
		total=piece*price;
		return total;
	}
	
	
	
	
	
	
	
	
	
	
}
