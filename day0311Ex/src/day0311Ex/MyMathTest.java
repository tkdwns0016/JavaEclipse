package day0311Ex;

public class MyMathTest {
	public static void main(String[] args) {
		int result1,result2;
		MyMath m=new MyMath();
		
		m.printSum(10, 5);
		
		m.sum(10, 5);
		
		m.printSum(10, 5, 7);
		
		m.sum(10, 5, 7);
		
		m.printSum(10.25, 5.74);
		
		m.sum(10.25, 5.74);
		
		m.sub(25, 20);
		
		m.mul(20, 2);
		
		m.div(10, 5);
		System.out.println("--------------");
		
		
		result1= m.sum(154,245);
		result2=m.sum(243,532,235);
		int result3=m.sum(result1, result2);
		System.out.println("숫자 5개의 합은 : "+result3+ "\t 합의 평균값은 : "+m.div(result3,5));
		
		
		
		
	}
}
