package day0319.listEx;

//java.util 안에있는 모든 클래스를 임포트 하겠다.
import java.util.*;


public class ListTest01 {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();		
		
		
		System.out.println("******list 객체 생성******");
		System.out.println("list의 크기: "+list.size());
		
		
		list.add("milk");
		System.out.println("******list에 milk추가******");
		System.out.println("list의 크기: "+list.size());
		System.out.println(list.toString());
		
		
		list.add("bread");
		System.out.println("******list에 bread추가******");
		System.out.println("list의 크기: "+list.size());
		System.out.println(list);
		
		
		list.add("butter");
		System.out.println("******list에 butter추가******");
		System.out.println("list의 크기: "+list.size());
		System.out.println(list);
		
		
		list.add(1, "apple");// index 1번에 apple추가
		System.out.println("******list에 index 1에 apple추가******");
		System.out.println("list의 크기: "+list.size());
		System.out.println(list.toString());
		
		
		list.set(2, "grape");// index 2에 grape 변경
		System.out.println("******list에 index 2에 grape 변경******");
		System.out.println("list의 크기: "+list.size());
		System.out.println(list.toString());
		
		
		list.remove(3);
		System.out.println("******list에 index 3에 butter 제거******");
		System.out.println("list의 크기: "+list.size());
		System.out.println(list.toString());
		
		
		
		//사용하기위해 꺼내기
		System.out.println("*****index 0번에 있는 값을 출력하시오*****");
		System.out.println("index 0번 : "+list.get(0));
		System.out.println("list의 크기: "+list.size());
		System.out.println(list.toString());
		
		
		
		
		
		
		
		
		
		
	}
}
