package day0405.ioEx01;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamEx01 {
	public static void main(String[] args) {
		// 메모리(배열)에서 데이터를 읽어오는 아이. 
		byte[] inByteData = {0,1,2,3,4,5,6,7,8,9};
		
		// 바이트 배열에서 읽는 스트림을 변수로 선언. ByteArrayInputStream이란것을 사용.
		ByteArrayInputStream input = null;
		
		// 어디서 읽어올지를 연결한다.
		input = new ByteArrayInputStream(inByteData);
		
		// 읽어와보자.
		int data = -1;
		while ((data = input.read()) != -1) {
			System.out.println(data);
		}
		
		
		
		
		
		
		
	}
}	
