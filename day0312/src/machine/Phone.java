package machine;

public class Phone extends Machine{
	int storage;
	
	
	public void call () {
		System.out.println("전화를 거는 중 입니다...");
	}
	
	
	
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("  용량은 : "+storage);
	}
}
