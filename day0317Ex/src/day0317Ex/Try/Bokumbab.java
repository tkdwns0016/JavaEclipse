package day0317Ex.Try;

public class Bokumbab extends Food{

	
	
	
	public Bokumbab(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public String eat1() {
		return "손으로 먹기";
	}
	
	public String eat2() {
		return "숟가락으로 먹기";
	}
	
	@Override
	public void cooking() {
		System.out.println("지글지글! 휘리릭!!");
	}
	
}
