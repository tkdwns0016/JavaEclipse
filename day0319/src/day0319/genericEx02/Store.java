package day0319.genericEx02;

//제네릭 표현 방식 ,  제네릭으로 타입을 고정하는 방법
public class Store<T> {	
	private T data;
	public void setData ( T data) {
		this.data=data;
	}
	
	public T getData() {
		return data;
	}
	
	
	
}
