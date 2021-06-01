package day0407Ex;

import java.io.File;
import java.io.IOException;

public class Ex01 {
	public static void main(String[] args) {
		File file =new File("day0407Ex/2021/04/07");
		file.mkdirs();
		file = new File("day0407Ex/2021/04/07/testMyFile");
		try {
			file.createNewFile();
			System.out.println("파일 생성 완료");
		} catch (IOException e) {
			System.out.println("파일 생성 실패");
			e.printStackTrace();
		}
	}
}
