package day0311.ex01;

public class MyMethodTest {
	public static void main(String[] args) {
		// 1~5까지의 수를 출력하는 코드를 작성해라
		// 클래스는 일반적으로 객체를 만들어야 사용할 수 있다.
		// 클래스 안에 있는 메서드 역시 객체가 있어야 실행 가능하다.
		
		MyMethod m = new MyMethod();
		m.printNumber();
		
		m.printName("네이버");
		m.printName("다음");
		m.printName("");
		
		m.printNum(110);
		
		// 세 수의 합
		m.sumNumbers(10,20,30);
		
		m.printSomething("스무번째 밤", 20, 3.14);
		
		System.out.println("두 수의 합 m.sum() 메서드 호출 ");
		int result=m.sum(10, 20);
		System.out.println(result);
		
		
		
		
		
	}
}
