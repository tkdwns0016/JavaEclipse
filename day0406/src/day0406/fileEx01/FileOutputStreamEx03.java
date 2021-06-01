package day0406.fileEx01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileOutputStreamEx03 {
	public static void main(String[] args) {
		//한글 넣기.
		File file = new File("src/day0406/fileEx01/ex03.txt");
		
		try(FileOutputStream fout = new FileOutputStream(file)){
			//한 번 쓸때 byte단위가 넘어가면 바이트가 짤린다.
			fout.write(65);	//A
			fout.write(321);//A 1바이트 = -128~127  -> 0~255까지
			String str = "ㅇ";
			byte[] strByteArra = str.getBytes();
			System.out.println(strByteArra.length);
			System.out.println(Arrays.toString(strByteArra));
			fout.write(strByteArra);
			System.out.println("작성완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
			
		
		
		
		
		
		
		
		
		
	}
}
