package ex01;

import java.util.Scanner;


public class Loop01 {
	public static void main(String[] args) {
		String[][] num = new String[5][5];
		String[] p=new String[5];
		int a,s,d,f,g,ans;
		int q,w,e,r,t;
		int	i=0,j=0,k=0;
		char ch;
		int[] lotto =new int[6];

		Scanner vi = new Scanner (System.in);
		System.out.println("알파벳을 입력해주세요 : ");
		ch = vi.next().charAt(0);
		
		if(ch>=65&&ch<=90) {
			ans= ch + 32;
			System.out.printf("대문자를 소문자로 변환 %c",ans);
		}else if(ch>=97&&ch<=122) {
			ans= ch - 32;
			System.out.printf("소문자를 대문자로 변환 %c",ans);
		}
		
		
		
		
		//10번 문제
//		for(j=0;j<6;j++) {lotto[j]=(int)(Math.random()*45)+1;
//			for (i=0;i<j;i++) {
//				if (lotto[i]==lotto[j]) {
//					j--;
//					break;
//					}
//				}
//			}
//		
//		for(i=0;i<6;i++) {
//		System.out.printf("%d \t",lotto[i]);
//		}
		
				
		
		
		
		
		
		//8번 문제
		
//		int v1=(int)(Math.random()*100)+10;
//		int v2=(int)(Math.random()*100)+10;
//		System.out.println(v1+"와"+v2);
//		System.out.println("------------------");
//		for(i=1;i<=v1;i++) {
//			for (j =1; j <=v2; j++) {
//				if (v1%i==0 && v2%j==0) {
//					if(i==j) {
//			 System.out.println(i+" & "+j);
//					}
//				}
//			}
//		}
		
		
		
		//7번 문제
//		 for (i = 0; i < 5; i++) {
//			 for (j = i; j <5; j++) {
//				 
//				 num[i][j] = "#";
//			 }
//		 }
//		 for (i = 0; i < 5; i++) {
//			 for (j = 0; j < 5; j++) {if(num[i][j]=="#") {
//				 System.out.print(""+num[i][j]);
//			 }else {System.out.printf(" ");
//				  
//			 }
//			 
//		 }System.out.printf("\n");
//		 }
		
		
		
		//6번 문제
//		Scanner input = new Scanner (System.in);
//		System.out.print("검색할 수 : ");
//		k=input.nextInt();
//		System.out.println();
//		for (i = 1; i <= 100; i++) {	
//			if(i%k==0) {
//				System.out.println(k+"의 배수="+i);
//			}
//		}
		
		// 5번 문제
//		for ( a = 0; a < 10; a++) {
//			for ( s = 0; s < 10; s++) {
//				for ( d = 0; d < 10; d++) {
//					for ( f = 0; f < 10; f++) {
//						for ( g = 0; g < 10; g++) {q=a*10000; w=s*1000; e=d*100; r=f*10; t=g;
//						k=q+w+e+r+t;
//						
//						if(k==56827) {
//							System.out.println("만원권"+q+"원,"+ "천원권"+w+"원, " + "백원권"+e+"원, " +"십원권"+r+"원, "+ "일원권"+t+"원, ");
//							System.out.println("필요한 만원권"+a+"개"+"\t"+"필요한 천원권"+s+"개"+"\t"+"필요한 백원권"+d+"개"+"\t"+"필요한 십원권"+f+"개"+"\t"+"필요한 일원권"+g+"개");
//						}else {continue;}
//						}
//					}
//				}
//			}
//		}
		
		
		
		
//		4번 문제		
//		Scanner input = new Scanner (System.in);
//		System.out.print("입력할 문자 : ");
//		ch=input.next().charAt(0);
//		
//		if (ch>=65&&ch<=90) {
//			System.out.println(ch+"는 대문자 입니다.");
//		}else if(ch>=97&&ch<=122) {
//			System.out.println(ch+"는 소문자 입니다.");
//		}
		
	
		
		//3-1 문제	switch-case 문
//		switch(키) {
//		case 값1:
//		case 값2:
//		case 값3:
//		default:	}
		
		//key 에는 문자, 문자열, 숫자가 가능하다.
//		int key = 3;
//		switch(key) {
//		case 1:
//			System.out.println("키는 1이다");
//			break;
//		case 2:
//			System.out.println("키는 2이다");
//			break;
//		case 3:
//			System.out.println("키는 3이다");
//			break;
//		case 4:
//			System.out.println("키는 4이다");
//			break;
//		case 5:
//			System.out.println("키는 5이다");
//			break;
//		}
		
		
		//3-2 문제 [숙제]
//		Scanner value = new Scanner(System.in);
//		System.out.println("점수를 입력해 주세요 : ");
//		int score = value.nextInt();
//		switch(score) {
//		case 100:
//			System.out.println("만점입니다.");
//			break;
//		case 99:case 98:case 97:case 96:case 95:case 94:case 93:case 92:case 91:case 90:
//			System.out.println("A학점 입니다.");
//			break;
//		case 89:case 88:case 87:case 86:case 85:case 84:case 83:case 82:case 81:case 80:
//			System.out.println("B학점 입니다.");
//			break;
//		case 79:case 78:case 77:case 76:case 75:case 74:case 73:case 72:case 71:case 70:
//			System.out.println("C학점 입니다.");
//			break;
//		case 69:case 68:case 67:case 66:case 65:case 64:case 63:case 62:case 61:case 60:
//			System.out.println("D학점 입니다.");
//			break;
//		default:
//			System.out.println("F학점 입니다.");
//			break;
//		}
		
		
		
// 3번 문제		
//		Scanner input = new Scanner (System.in);
//		System.out.print("점 수 : ");
//		k=input.nextInt();
//		if(k==100) {
//			System.out.println("만점입니다.");
//		}else if(k<100 &&k>=90) {
//			System.out.println("A학점입니다.");
//		}else if(k<90 &&k>=80) {
//			System.out.println("B학점입니다.");
//		}else if(k<80 &&k>=70) {
//			System.out.println("C학점입니다.");
//		}else if(k<70 &&k>=60) {
//			System.out.println("D학점입니다.");
//		}else if(k<60) {
//			System.out.println("F학점입니다.");
//		}
		
		
		
// 1번, 2번 문제		
//		Scanner input = new Scanner (System.in);
//		System.out.print("검색할 수 : ");
//		k=input.nextInt();
//			if(k%3==0) {
//				System.out.println(k+"는(은)"+3+"의 배수="+i);
//			}
//		}
		
		
//		Scanner myscan;							스캐너 변수 생성
//		myscan = new Scanner(System.in);		스캐너 객체 생성 및 대입
//		System.out.println("숫자를 입력해 주세요:");
//		int num=myscan.nextInt();				사용자로부터 입력받음
		/*
		 * Scanner input = new Scanner (System.in); System.out.println("최대 단 수"); int f
		 * = input.nextInt();
		 * 
		 * for(i=1;i<10;i++) { for(j=2;j<=f;j++) { k=i*j;
		 * System.out.print(j+"*"+i+"="+k+"\t"); }System.out.println(); }
		 */
		
		/*
 		for (i=1;i<=5;i+=1) {
			System.out.println("안녕하세요"+i);
			
		}
		System.out.println("--------------");
		for (i=5;i>=1;i-=1) {
			System.out.println("안녕하세요"+i);
		}
		System.out.println("--------------");
		for (i=10;i>5;i-=1) {
			System.out.println("안녕하세요"+i);
		}
		System.out.println("--------------");
		for (i=3;i<=15;i+=3) {
			System.out.println("안녕하세요"+i);
			System.out.println("안	녕	하	세	요");
		}*/
		
		
		
	}
}