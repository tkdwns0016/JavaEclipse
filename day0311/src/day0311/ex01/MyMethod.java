package day0311.ex01;

public class MyMethod {

	
	
// [ 메서드의 형태 ]
// 수식자 반환타입 메서드명 (매개변수){	
// 실행할 문장
// }

	// 메서드 역시 마찬가지로 재사용성은 높이기 위해서 사용된다.
	// void 는  반환타입이 없음을 나타냄
	void printNumber(){
		int i=1;
		System.out.println(i++);
		System.out.println(i++);
		System.out.println(i++);
		System.out.println(i++);
		System.out.println(i++);
		}
	
	// 매개 변수를 받는 메서드
	// 문자열을 전달받아 콘솔에 출력하는 메서드	
	void printName(String n) {
		System.out.println("전달받은 값 : "+n);
		}
		
	void printNum(int number) {
		System.out.println("전달받은 숫자 : "+number);
	}
		
	// 매개변수를 여러개 받는 방법
	// 세 수를 전달받아 총합을 구하여 출력하는 메서드
	void sumNumbers(int n1,int n2,int n3) {
		System.out.println("세수의 합 : "+(n1+n2+n3));
	}
			
	void printSomething(String s, int num,double num2) {
		System.out.println("문자열 : "+s);
		System.out.println("정수 : "+num);
		System.out.println("실수 : "+num2);
	}
	
	// 반환타입이 있는 메서드
	// 두 수의 합을 반환하는 메서드
	int sum(int num1,int num2) {
		int tot= num1+num2;
		return tot;
//		return num1+num2; 이렇게 표현해도 됨
	}
	
	int sum(int num1,int num2,int num3) {return num1+num2+num3;} 
//	일반적으로 똑같은 메서드는 정의할수 없다. 
//	메서드 안에 메서드는 정의 할수 없다. 
//	같은이름의 메서드를 만드려면 매개변수의 개수가 다르거나, 매개변수의 타입이 다르거나 해야한다. [ 메서드의 오버로딩 ]
	
	
}
