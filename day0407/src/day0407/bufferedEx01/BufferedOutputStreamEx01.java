package day0407.bufferedEx01;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamEx01 {
	public static void main(String[] args) {
		// 버퍼 : 바가지 같은것
		// 버퍼링은 바가지에 데이터를 채우고 일정량이 차면 바가지채로 보내 그 일정량 만큼의 데이터를 보게 됨.
		
		//기본(씽크) 입출력 스트림에 (처리)스트림을 연결해서 사용한다.
		File file = new File("src/day0407/bufferedEx01/BufferedOutputStreamEx01.txt");
		
		// 씽크스트림 변수 생성
		FileOutputStream fout = null;
		
		// 처리스트림 변수 생성
		BufferedOutputStream bout = null;
		
		try {
			// 파일을 아웃풋 스트림에 연결
			fout=new FileOutputStream(file);
			
			// 아웃풋 스트림을 버퍼 아웃풋 스트림에 연결.
			bout = new BufferedOutputStream(fout);
			
			bout.write(65);
			bout.write(66);
			bout.write(67);
			
			System.out.println("파일 작성 끝");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(bout != null) {try {bout.close();}catch(IOException e){}	}
		}
		
	}
}
