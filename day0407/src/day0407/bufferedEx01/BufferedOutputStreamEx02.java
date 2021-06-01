package day0407.bufferedEx01;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamEx02 {
	public static void main(String[] args) {
		File file = new File("src/day0407/bufferedEx01/BufferedOutputStreamEx02");
		FileOutputStream fout =null;
		BufferedOutputStream bout = null;
			
//		try(FileOutputStream fout = new FileOutputStream(file);
//				BufferedOutputStream bout = new BufferedOutputStream(fout);){
		try {
			fout = new FileOutputStream(file);
			bout = new BufferedOutputStream(fout);
			bout.write(65);
			bout.write(66);
			bout.write(67);
			bout.write(67);
			bout.write(67);
//			bout.flush();//내용이 다 차지 않아도 데이터를 표시하고 버퍼에 차있는 데이터를 비운다.
			System.out.println("생성완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(bout != null) {try {bout.close();} catch (IOException e) {}
			}
		}
	}
}
