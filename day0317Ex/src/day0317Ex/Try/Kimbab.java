package day0317Ex.Try;

public class Kimbab extends Food{
	
	
	
	
	
	public Kimbab(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public String eat1() {
		return "손으로 먹기";
	}
	
	public String eat2() {
		return "젓가락으로 먹기";
	}
	
	@Override
	public void cooking() {
		System.out.println("스르륵 스르륵!!");
	}
	
}
