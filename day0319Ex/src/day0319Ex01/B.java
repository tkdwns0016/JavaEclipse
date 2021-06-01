package day0319Ex01;

import java.util.ArrayList;

public class B {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("운동");
		arr.add("밥먹기");
		arr.add("게임");
		System.out.println(arr);
		arr.add(1, "공부");
		arr.add(1, "코딩");
		System.out.println("배열리스트의 사이즈: "+arr.size()+"    배열리스트의 내용"+arr.toString());
		System.out.println("----------------------------");
		System.out.println(arr.get(0));
		arr.remove(1);
		System.out.println("----------------------------");
		for(int i=1;i<=2;i++) {
			System.out.println(arr.get(i));
		}
		
		
		
		
		
		
		
	}
}
