package day0405.ioEx01;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class ByteArrayOutputStreamEx01 {
	public static void main(String[] args) {
		byte[] result;
		
		//바이트 아웃풋 스트림 객체를 생성.
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		
		//스트림 자체에 write를 한다.
		out.write(0);
		out.write(1);
		out.write(2);
		out.write(3);
		out.write(4);
		
		//안에 있던 데이타들을 byte배열로 변경하여 반환한다.
		result = out.toByteArray();
		System.out.println(Arrays.toString(result));
		
		
		
		
		
		
		
		
		
	}
}
