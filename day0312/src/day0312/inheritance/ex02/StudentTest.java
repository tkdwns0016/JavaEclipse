package day0312.inheritance.ex02;

public class StudentTest {
	public static void main(String[] args) {
		Person p=new Person("진출",10);
		
		
		Student s = new Student("의진",9);
		s.kor=10;
		s.eng=20;
		s.math=30;
		s.introduce();
		
	}
}
