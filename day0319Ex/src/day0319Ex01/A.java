package day0319Ex01;

import java.util.ArrayList;

public class A {
	public static void main(String[] args) {
		int[] number = new int[8];
		number[0]=1;
		number[1]=5;
		number[2]=10;
		number[3]=15;
		number[4]=20;
		
		number[5]=30;
		number[6]=40;
		for(int i=0;i<number.length;i++) {
//		System.out.println(number[0]+"  "+number[1]+"  "+number[2]+"  "+number[3]+"  "+number[4]+"  "+number[5]+"  "+number[6]+"  "+number[7]+"  "+number[8]+"  ");
			System.out.println(number[i]);
		}System.out.println("---------------------------");
		for(int i=7;i>2;i--) {
			number[2]=100;
			
			number[i]=number[i-1];
		}
		number[3]=10;
		System.out.println("---------------------------");
		for(int i=0;i<number.length;i++) {
				System.out.println(number[i]);
			}
		System.out.println("---------------------------");
		number[4]=2;
		for(int i=0;i<number.length;i++) {
			System.out.println(number[i]);
		}
	}
}
