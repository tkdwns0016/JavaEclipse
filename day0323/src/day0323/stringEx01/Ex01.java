package day0323.stringEx01;

public class Ex01 {
	public static void main(String[] args) {
		Car c = new Car();
		c.name = "자동차";
		Car c1 = c;
		System.out.println("c.hashCode(): "+c.hashCode());
		System.out.println("c1.hashCode(): "+c1.hashCode());
		System.out.println("c.name: "+c.name);
		System.out.println("c1.name: "+c1.name);
		c1.name = "하이";
		System.out.println("c.name: "+c.name);
		System.out.println("c1.name: "+c1.name);
		
		
		//기본 클래스들
		//문자열 관련 클래스 : String 
		//String 의 특징 중 하나 불변 객체이다. immutable [불변하는,변하지않는]
		String str = "문자열";
		String str1 = "문자열";
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		//위 문자열은 같은 주솟값을 가진다. "문자열"을 재사용 한다.
		//하지만 new 는 새로운 주솟값을 배정해주기 때문에 위와 다르다.
		String str2 = new String("문자열");
		
		System.out.println("str"+str);
		str="문자열1";
		System.out.println("str.hashCode(): "+str.hashCode()); // str 의 내용을 바꾸는 것이 아닌 새로운 내용을 넣는것이기 때문에 [불변] 이라 한다.
		System.out.println("str1.hashCode(): "+str1.hashCode());
		System.out.println(str);
		System.out.println(str1);
		
		//변수에 담긴 주소를 비교함. 두 주소가 같다.
		System.out.println(str == str1);	//true
		
		//변수에 담긴 주소를 비교하기 때문에 다른값이다.
		System.out.println(str1 == str2);	//false
		
		
		String result = (str1==str2)? "참" : "거짓";
		System.out.println(result);//거짓
		
		String result1 = (str1.equals(str2))? "참" : "거짓";
		System.out.println(result1);//참
		
		
		
		
		
		
		
		
	}
}