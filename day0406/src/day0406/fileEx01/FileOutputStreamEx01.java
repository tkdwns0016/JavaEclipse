package day0406.fileEx01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx01 {
	public static void main(String[] args) {
		// 파일에 쓰기 위해서 필요한 놈.
		FileOutputStream fout = null;
		
		try {
			
			// new FileOutputStream("쓰고자 하는 대상 파일 주소 or 파일 객체");
			// 파일 주소는 상대 주소 또는 절대 주소로 넣어줄 수 있다.
			// 상대경로는 현재 프로젝트를 기준으로 잡았다.
//			fout = new FileOutputStream("../../test.txt");
			// 절대경로
			fout = new FileOutputStream("C:/Users/TJOEUN/new_test.txt");
			// outputStream 객체.write(쓸 데이터);
			fout.write(65);
			System.out.println("작성함.");
			
			Thread.sleep(100000);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			if (fout != null) {
			try {
				fout.close(); // 반드시 닫아주는 코드를 써야한다.
			} catch (IOException e) {
				e.printStackTrace();
			}
			}
		}
	}
}
