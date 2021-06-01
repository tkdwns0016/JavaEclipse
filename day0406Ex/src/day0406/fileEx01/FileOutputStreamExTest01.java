package day0406.fileEx01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileOutputStreamExTest01 {
	public static void main(String[] args) {
		byte[] num=new byte[26];
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("src\\day0406\\fileEx01\\text.txt");
			int a=0;
			
			for (int i = 97; i < 123; i++) {
				num[a] = (byte) i;
				fout.write(num[a]);
				a++;
			}
		
		
		
		System.out.println("작성 완료");
		
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
