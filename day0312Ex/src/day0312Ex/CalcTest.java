package day0312Ex;

public class CalcTest {
	public static void main(String[] args) {
		int a,b;
		int q,w,e;
		double r;
		Calc cal = new Calc();
		MyCalc mcal = new MyCalc();
		a=cal.sum(5, 64);
		b=cal.sub(68, 44);
		System.out.println("cal.sum 값은 : "+a + "\t cal.sub 값은 : "+b);
		
		
		
		
		System.out.println("-----------------------");
		q=mcal.sum(5, 65);
		w=mcal.sub(67, 42);
		e=mcal.mul(5,75);
		r=mcal.div(120, 5);
		System.out.println("mcal.sum 값은 : "+q + "\t mcal.sub 값은 : "+w);
		System.out.println("mcal.mul 값은 : "+e + "\t mcal.div 값은 : "+r);
		
	}
}
