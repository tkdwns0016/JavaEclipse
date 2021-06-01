package day0317Ex.Try;

public class Ramen extends Food{
	
	
	
	
	public Ramen(String name) {
		this.name=name;
	}
	
	@Override
	public String getName() {
		return super.getName();
	}
	
	public String eat1() {
		return "손으로 먹기";
	}
	
	public String eat2() {
		return "젓가락으로 먹기";
	}
	
	@Override
	public void cooking() {
		System.out.println("보글보글!!");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
