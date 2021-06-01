package day0310Ex;

import java.util.Scanner;

public class StudentEx2 {
public static void main(String[] args) {
	double total,avg;
	int i;
	int who,kim;
	char st;
	
	Scanner man=new Scanner(System.in);
	System.out.println("몇명의 상준을 만들겁니까?");
	kim=man.nextInt();

	Student[] sangjun= new Student[kim];
	
	for(i=0;i<kim;i++) {
	sangjun[i]=new Student();
	System.out.println(kim+"명의 상준 생성 완료");
	
	Scanner num=new Scanner(System.in);
	Scanner nam=new Scanner(System.in);
	Scanner val=new Scanner (System.in);
	
	System.out.println((i+1)+"번째 상준");
			System.out.println("이름은?");
			sangjun[i].name=nam.next();
			
			System.out.println("나이는?");
			sangjun[i].age=val.nextInt();
			
			System.out.println("국어점수를 입력해주세요.");
			sangjun[i].kor=val.nextInt();
			
			System.out.println("영어점수를 입력해주세요.");
			sangjun[i].eng=val.nextInt();
			
			System.out.println("수학점수를 입력해주세요.");
			sangjun[i].math=val.nextInt();
			
			sangjun[i].printInfo();
			total=(double)sangjun[i].kor+sangjun[i].eng+sangjun[i].math;
			avg=total/3;
			System.out.println("점수 합 : "+total);
			System.out.printf("평균점수 : %.3f  \n",avg);
		
	Scanner nam1 = new Scanner (System.in);
		System.out.println("계속 하시겠습니까? Y/N");
		st=nam1.next().charAt(0);
		if(st=='N') {break;}else if(st=='Y') {continue;}
	}
	}

}