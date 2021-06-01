package day0407.fileEx01;

import java.io.File;
import java.io.IOException;

public class Ex01 {
	public static void main(String[] args) {
		// File 클래스!!!
		// 파일을 관리해주는 기능이 있는 클래스.
		
		File file = new File("myFile01.txt");
		// 파일을 만들거나, 파일이 있는지 판단하거나, 폴더를 만들 수 있다.
		// day0407/myfileEx01/myFile01.txt 파일이 있는지 확인
		// 파일이 있는지 판단하는 코드.!
		file = new File("day0407/myfileEx01/myFile01.txt");
		if(file.exists()) {//day0407/myfileEx01/myFile01.txt 가 있는지 확인.
			System.out.println("있음");
		}else {
			System.out.println("없음");
			try {
				// 없으면 파일을 생성해보자.!
//				file.createNewFile();
				// 폴더부터 만들어야함!
				file = new File("day0407");
				file.mkdir();
				file = new File("day0407/myfileEx01");
				file.mkdir();
				// 폴더를 다 만들고 이제 파일생성!
				file = new File("day0407/myfileEx01/myFile01.txt");
				file.createNewFile();
				System.out.println("파일이 생성됨.");
			} catch (IOException e) {
				System.out.println("파일 생성이 안돼요!!");
				e.printStackTrace();
			}
		}
		 
		
	}
}