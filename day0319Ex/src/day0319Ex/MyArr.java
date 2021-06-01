package day0319Ex;

public class MyArr<T> {
	private T[] arr;
	int i=1;
	
	public MyArr() {
		arr = (T[])new Object[10];
	}
	
	
	
	public void add(T phone) {
		arr[0] = phone;
		System.out.println(i+"번째 입력됐습니다.");
		i++;
	}
	
	
	public T get(int n) {
		return arr[n];
	}
	
	
	
	
	
	
	
}
