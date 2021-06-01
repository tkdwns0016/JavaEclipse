package day0312.inheritance.ex02;

public class Student extends Person{
	//이름과 나이를 재사용한다.
	//국어,영어,수학 성적을 추가
	int kor;
	int eng;
	int math;
	
	Student(String name, int age){
		super(name,age);
	}
	
	
	@Override
	public void introduce() {
		super.introduce();
		System.out.println("국어:"+kor+", 영어:"+eng+", 수학:"+math);

	}
}
