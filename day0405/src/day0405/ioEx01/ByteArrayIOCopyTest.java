package day0405.ioEx01;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class ByteArrayIOCopyTest {
	public static void main(String[] args) {
		byte[] ori = {0,1,2,3,4,5,6,7,8,9};
		byte[] copy;
		
		ByteArrayInputStream in = new ByteArrayInputStream(ori);
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		
		
		// 인풋으로 읽은 값을 아웃풋에 저장!!
		// 바가지 사용
		byte[] bagagi = new byte [10];
		
		in.read(bagagi,0,10);//in의 값 0부터 10까지를 읽어서 bagagi에 저장
		
		System.out.println("bagagi : "+Arrays.toString(bagagi));
		
		out.write(bagagi,0,10);
		copy = out.toByteArray();
		System.out.println("copy : "+Arrays.toString(copy));
		
		
		
		
		
		
		
		
		
	}
}
