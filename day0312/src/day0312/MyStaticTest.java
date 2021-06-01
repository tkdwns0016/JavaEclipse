package day0312;

public class MyStaticTest {
	public static void main(String[] args) {
		MyStatic myStaticObj = new MyStatic();
		myStaticObj.noneStaticNum=10;
		myStaticObj.staticNum=50;
		
		System.out.println("noneStaticNum :  "+myStaticObj.noneStaticNum);
		System.out.println("staticNum :  "+myStaticObj.staticNum);
		System.out.println("--------------------------------");
		
		MyStatic myStaticObj1= new MyStatic();
		myStaticObj1.noneStaticNum=20;
		myStaticObj1.staticNum=100;
		
		System.out.println("noneStaticNum :  "+myStaticObj.noneStaticNum);
		System.out.println("staticNum :  "+myStaticObj.staticNum);
		
		System.out.println("1.noneStaticNum :  "+myStaticObj1.noneStaticNum);
		System.out.println("1.staticNum :  "+myStaticObj1.staticNum);
		
		//static 변수는 공유폴더와 같다.
		//static변수 사용법 : 클래스명.스태틱변수 = 값;
		MyStatic.staticNum = 1000;
		MyStatic.printNumbers();
		
		//random 부분도 스태틱이다.
		Math.random();
	}
}
