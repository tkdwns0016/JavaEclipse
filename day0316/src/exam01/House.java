package exam01;

public class House {
	String name;
	int age;
	int bloom;
	
	HouseItem1 houseitem1;
	HouseItem houseitem;
	
	
	
	public House (String name,int age,int bloom,HouseItem1 houseitem1, HouseItem houseitem) {
		this.name=name;
		this.age=age;
		this.bloom=bloom;
		this.houseitem1=houseitem1;
		this.houseitem=houseitem;
	}
	
	
	@Override
	public String toString() {
		String str ="물품명 : "+houseitem1.name+", 가격 : "+houseitem1.price+", 갯수 : "+houseitem1.piece+"\n 물품명 : "+houseitem.name+", 가격 : "+houseitem.price+", 갯수 : "+houseitem.piece;
		
		return str;
	}
	
	
	
	
}
