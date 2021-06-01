package day0319Ex01;

import java.util.ArrayList;

public class StudentTest {
	public static void main(String[] args) {
		Student student0= new Student("김상준", 26, 50, 40, 20); 
		Student student1= new Student("슬라임", 56, 10, 5, 20); 
		Student student2= new Student("스텀프", 95, 82, 25, 95); 
		Student student3= new Student("베인", 35, 15, 7, 95); 
		Student student4= new Student("카이사", 29, 60, 70, 50); 
		
		ArrayList<Student> stlist = new ArrayList<Student>();
		stlist.add(student0);
		stlist.add(student1);
		stlist.add(student2);
		stlist.add(student3);
		stlist.add(student4);
			
		stlist.get(student0.getName());
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
