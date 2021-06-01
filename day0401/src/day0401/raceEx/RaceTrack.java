package day0401.raceEx;

public class RaceTrack implements Runnable{
		//스레드를 이용하여 간단한 경마 게임을 만들어보세요.
		//Horse 클래스를 스레드로 만들어
		//각 객체는 랜덤시간동안 슬립을 하도록 구현.
		
		//5개의 Horse객체를 만들어 start()한뒤
		//1~5등 도착
	@Override
	public void run() {
		int sleep = ((int)Math.random()*10000)+100;
		
		}
	}
}
