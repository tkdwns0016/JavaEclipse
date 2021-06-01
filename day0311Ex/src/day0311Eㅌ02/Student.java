package day0311Eㅌ02;

public class Student {
	String name;
	int age=15;
	int kor=0;
	int math=0;
	int eng=0;
	
	
	
	public Student(String name,int age) {
		System.out.println("이름은 : " + name + "\t나이는 : "+age);
	}
	
	public Student(String name,int age,int kor,int math,int eng) {
		double avg=((double)kor+math+eng)/3;
		System.out.println("이름은 : " + name + "\t나이는 : "+age);
		System.out.println("국어성적 : "+kor+"\t 수학성적 : "+ math+ "\t 영어성적 : "+eng);
		System.out.println("총합: "+(kor+math+eng)+"\t 평균 : "+avg);
	}
	
	
	public Student(String name,int kor,int math,int eng) {
		double avg=((double)kor+math+eng)/3;
		System.out.print("이름은 : " + name+"\t 나이는 : "+this.age);
		System.out.println("국어성적 : "+kor+"\t 수학성적 : "+ math+ "\t 영어성적 : "+eng);
		System.out.println("총합: "+(kor+math+eng)+"\t 평균 : "+avg);
	}
}