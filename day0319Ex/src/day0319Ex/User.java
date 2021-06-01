package day0319Ex;

public class User<T> extends MyArr<T>{
	public static void main(String[] args) {
		
		Phone phone = new Phone("01087478598");
		MyArr<Phone> number = new MyArr<>();
				
		number.add(phone);
		
		System.out.println(number.get(0));
		
		
	}
}
