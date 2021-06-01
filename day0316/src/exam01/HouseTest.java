package exam01;



public class HouseTest {
	public static void main(String[] args) {
		
		HouseItem1 h1 = new HouseItem1("불닭볶음면", 7, 1200);
		HouseItem h = new HouseItem ("동원참치", 5, 5000);
		
		
		House kim = new House("김상준", 26, 50, h1, h);
		
		
		System.out.println(kim);
		
		
		
		System.out.println("----------------------------");
		System.out.println("물품명 : "+kim.houseitem1.getName1()+"   "+kim.houseitem1.getPrice1());
		System.out.println("물품명 : "+kim.houseitem.getName()+"   "+kim.houseitem.getPrice());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
