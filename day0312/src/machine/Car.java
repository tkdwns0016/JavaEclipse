package machine;

public class Car extends Machine{
	
	
	String carType;
	int seater;
	int Speed=0;
	int incSpeed,downSpeed;
	int maxSpeed;
	double dist;
	int cri;
	int die;
	
	public void Info() {
		System.out.println("차량정보를 작성해 주세요.");
	}
	
	public void startUp() {
		System.out.println("시동을 겁니다.");
	}
	
	public void go() {
		System.out.println("출발합니다.");
	}
	
	public void dist(double dist) { //distance 지정
		this.dist=dist;
	}
	
	public int speedup() {		//스피드 상승
		incSpeed=(int)(Math.random()*20)+1;
		Speed=Speed+incSpeed;
		System.out.println("현재 속도는 : "+Speed+" km/h 입니다");
		
		dist=dist-(Speed/10);
		if(dist<=5)	{
			System.out.println("도착했습니다.");
		}
		System.out.println("남은거리는 : "+dist +"km 입니다");
		if (Speed>=100) {
			System.out.println("사망했습니다");
			}
		
	}
		
		
		
	
	
	public void speeddown() {	//스피드 다운
		downSpeed=(int)(Math.random()*15)+1;
		Speed=Speed-downSpeed;
		System.out.println("현재 속도는 : "+Speed+" km/h 입니다");
		dist=dist-(Speed/10);
		if(dist<=5)	{
			System.out.println("도착했습니다.");
			}
		
		System.out.println("남은거리는 : "+dist +"km 입니다");
	}

	
//	public void remain() {		//남은거리
//		System.out.println("남은거리는 : "+dist +"km 입니다");
//	if(dist<=5)	{
//		System.out.println();
//		}
//	}
	
	
	@Override
	public void printInfo() {
		System.out.printf("차종은 "+carType+"이고   " + seater+"인승입니다.");
		
	}

		
	
}
	
	
	
	
	

