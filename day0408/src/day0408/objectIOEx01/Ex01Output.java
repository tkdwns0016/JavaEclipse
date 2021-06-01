package day0408.objectIOEx01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ex01Output {
	public static void main(String[] args) {
		Person p1 = new Person("빈센조", 40,99);
		Person p2= new Person("김상준", 26,63.58);
		Person p3 = new Person("정", 24,0);
		
		File file = new File("src/day0408/objectIOEx01","person");
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))){
			oos.writeObject(p1);
			oos.writeObject(p2);
			oos.writeObject(p3);
			
			System.out.println("객체를 파일에 작성 했음.!");
			
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
