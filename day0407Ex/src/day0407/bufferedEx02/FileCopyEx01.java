package day0407.bufferedEx02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyEx01 {
	public static void main(String[] args) {
		//파일복사
		//원하는 파일을 읽고 그걸 새파일에 쓰면됨.
		try(BufferedInputStream bin = new BufferedInputStream(new FileInputStream(new File("C:/Users/Mr.KIM/Desktop/KakaoTalk_20201229_012205766.jpg")));
				BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("C:/Users/Mr.KIM/Desktop/2205766.jpg"))){
			
			while(bin.available()>0) {
				bout.write(bin.read());
			}
			bout.flush();
			System.out.println("파일 복사 끝.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
