package day0311Eㅌ02;

import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		int v,i,a,k,m,e;
		int kor,eng,math;
		int[] kor1=new int[3];
		int[] math1=new int[3];
		int[] eng1=new int[3];
		double avg,avgk,avgm,avge;
		String n;

		
		Student[] st=new Student[3];
		Scanner kim = new Scanner(System.in);
		for(i=0;i<st.length;i++) {
			System.out.println((i+1)+"번째 학생의 이름을 입력해주세요");
			n=kim.next();
			
			switch(i) {
			case 0:
				System.out.println("나이를 입력해주세요.");
				v=kim.nextInt();
				System.out.println("국어성적을 입력해주세요.");
				kor=kim.nextInt();
				kor1[i]=kor;
				System.out.println("수학성적을 입력해주세요.");
				math=kim.nextInt();
				math1[i]=math;
				System.out.println("영어성적을 입력해주세요.");
				eng=kim.nextInt();
				eng1[i]=eng;
				avg=((double)kor+eng+math)/3;
				st[i]=new Student(n,v);	
				System.out.println("국어성적 : "+kor+"\t 수학성적 : "+ math+ "\t 영어성적 : "+eng);
				System.out.println("총합: "+(kor+math+eng)+"\t 평균 : "+avg);
				break;
			case 1:
				System.out.println("나이를 입력해주세요.");
				v=kim.nextInt();
				System.out.println("국어성적을 입력해주세요.");
				k=kim.nextInt();
				kor1[i]=k;
				System.out.println("수학성적을 입력해주세요.");
				m=kim.nextInt();
				math1[i]=m;
				System.out.println("영어성적을 입력해주세요.");
				e=kim.nextInt();
				eng1[i]=e;
				st[i]=new Student(n,v,k,m,e);	
				break;
			case 2:
				System.out.println("국어성적을 입력해주세요.");
				k=kim.nextInt();
				kor1[i]=k;
				System.out.println("수학성적을 입력해주세요.");
				m=kim.nextInt();
				math1[i]=m;
				System.out.println("영어성적을 입력해주세요.");
				e=kim.nextInt();
				eng1[i]=e;
				st[i]=new Student(n,v,k,m,e);	
			}
			System.out.println("-------다음 사람--------");
		}
		avgk = (((double)kor1[0]+kor1[1]+kor1[2])/3);
		avge = (((double)eng1[0]+eng1[1]+eng1[2])/3);
		avgm = (((double)math1[0]+math1[1]+math1[2])/3);
		System.out.println("국어 점수의 총합 : "+(kor1[0]+kor1[1]+kor1[2])+ "\t 국어 점수의 평균 : "+avgk);
		System.out.println("영어 점수의 총합 : "+(eng1[0]+eng1[1]+eng1[2])+ "\t 영어 점수의 평균 : "+avge);
		System.out.println("수학 점수의 총합 : "+(math1[0]+math1[1]+math1[2])+ "\t 수학 점수의 평균 : "+avgm);
		System.out.println("끝입니다ㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏ");
	}
}