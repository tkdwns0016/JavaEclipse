package day0408.objectIOEx01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ex01Input {
	public static void main(String[] args) {
		//좀 전에 만든 빈센조를 가져와보자!!
		//역직렬화 해서 가져오자
		File file = new File("src/day0408/objectIOEx01","person");
		
		try(ObjectInputStream oin = new ObjectInputStream(new FileInputStream(file))){
			
			Person p1 = (Person) oin.readObject();
			Person p2 = (Person) oin.readObject();
			Person p3 = (Person) oin.readObject();
			System.out.println(p1.getName());
			System.out.println(p1.getAge());
			System.out.println(p1.getHeight());
			System.out.println("-------------");
			System.out.println(p2.getName());
			System.out.println(p2.getAge());
			System.out.println(p2.getHeight());
			System.out.println("-------------");
			System.out.println(p3.getName());
			System.out.println(p3.getAge());
			System.out.println(p3.getHeight()+"kg 삐빅 몸무게가 감지되지 않습니다.");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
