package day0407Ex;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex03 {
	static int a=0;
	public static void main(String[] args) {
		byte[] byt;
		File file = new File("C:/Users/Mr.KIM/Desktop/"+a+".jpg");
		try (BufferedInputStream bin = new BufferedInputStream(new FileInputStream(new File("C:/Users/Mr.KIM/Desktop/KakaoTalk_20201229_012205766.jpg")));
				BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream(file))){
			byt = bin.readAllBytes();
			
				
			bout.write(byt, 0, byt.length);
			
			System.out.println("파일 생성 완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
