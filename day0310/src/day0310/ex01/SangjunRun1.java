package day0310.ex01;

public class SangjunRun1 {
public static void main(String[] args) {
	SangjunRun runner = new SangjunRun();
	
	
	runner.step= 0;
	runner.kcal =200;
	runner.weight = 65;
	int i;
	System.out.println("살 빼자");
	
	runner.start();
	
	runner.run();
	
	for( i=0; i<=200; i++) {
		runner.step+=100;
		if(runner.step==300) {runner.kcal-=40;}
			if(runner.kcal==0) {runner.weight=runner.weight-2;}
		if(runner.kcal==0) {runner.kcal=200;}
		if(runner.step==300) {runner.step=0;}
		System.out.println("운동중 ...");
		if(runner.weight==55) {break;}
		System.out.println(i+"분 후");
	}
	System.out.println(runner.weight);
	System.out.println(runner.kcal);
	System.out.println(runner.step);
	
	System.out.println("현재 몸무게는 "+runner.weight+"kg입니다" + i);
	runner.stop();
	
	
	}
}
