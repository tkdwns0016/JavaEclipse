package day0401.raceEx;

public class Horse implements Runnable{
	int distance=0;
	String name;
	public Horse(String name) {
		this.name = name;
	}


	public void run() {
		while(true) {
			try {
				Thread.sleep(((int)Math.random()*1000)+100);


			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			distance += ((int)Math.random()*50)+10;
			System.out.println(name +" "+distance+"m");
			if(distance == 500) {
				System.out.println(name+" µµÂø!");
				break;
			}
		}
	}
}
