package day0310Ex;

import java.util.Scanner;

public class StudentEx {
public static void main(String[] args) {
	double total,avg;
	int i;
	int who;
	
	Student[] sangjun= new Student[3];
	
	sangjun[0]=new Student();
	sangjun[1]=new Student();
	sangjun[2]=new Student();
	while(true) {
		
	Scanner num=new Scanner(System.in);
	Scanner nam=new Scanner(System.in);
	Scanner val=new Scanner (System.in);
	System.out.println("누구세요 (0, 1, 2) 중지:100");
	who =num.nextInt();
	if(who==100) {break;}
		if(who==0) {
			System.out.println("이름은?");
			sangjun[who].name=nam.next();
			
			System.out.println("나이는?");
			sangjun[who].age=val.nextInt();
			
			System.out.println("국어점수를 입력해주세요.");
			sangjun[who].kor=val.nextInt();
			
			System.out.println("영어점수를 입력해주세요.");
			sangjun[who].eng=val.nextInt();
			
			System.out.println("수학점수를 입력해주세요.");
			sangjun[who].math=val.nextInt();
			
			sangjun[0].printInfo();
			total=(double)sangjun[who].kor+sangjun[who].eng+sangjun[who].math;
			avg=total/3;
			System.out.println("점수 합 : "+total);
			System.out.printf("평균점수 : %.3f  \n",avg);
		}else if(who==1) {
			System.out.println("이름은?");
			sangjun[who].name=nam.next();
			
			System.out.println("나이는?");
			sangjun[who].age=val.nextInt();
			
			System.out.println("국어점수를 입력해주세요.");
			sangjun[who].kor=val.nextInt();
			
			System.out.println("영어점수를 입력해주세요.");
			sangjun[who].eng=val.nextInt();
			
			System.out.println("수학점수를 입력해주세요.");
			sangjun[who].math=val.nextInt();
			
			sangjun[1].printInfo();
			total=(double)sangjun[who].kor+sangjun[who].eng+sangjun[who].math;
			avg=total/3;
			System.out.println("점수 합 : "+total);
			System.out.printf("평균점수 : %.3f  \n",avg);
			}else if(who==2) {
				System.out.println("이름은?");
				sangjun[who].name=nam.next();
				
				System.out.println("나이는?");
				sangjun[who].age=val.nextInt();
				
				System.out.println("국어점수를 입력해주세요.");
				sangjun[who].kor=val.nextInt();
				
				System.out.println("영어점수를 입력해주세요.");
				sangjun[who].eng=val.nextInt();
				
				System.out.println("수학점수를 입력해주세요.");
				sangjun[who].math=val.nextInt();
				
				sangjun[2].printInfo();
				total=(double)sangjun[who].kor+sangjun[who].eng+sangjun[who].math;
				avg=total/3;
				System.out.println("점수 합 : "+total);
				System.out.printf("평균점수 : %.3f  \n",avg);
				}
		System.out.println("-----------------------");
	}
}
}