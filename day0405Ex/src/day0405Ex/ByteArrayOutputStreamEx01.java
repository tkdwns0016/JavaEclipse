package day0405Ex;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class ByteArrayOutputStreamEx01 {
	public static void main(String[] args) {
		byte[] byt = new byte[128];
		byte[] bytout;
		int bte=-1;
		
		for (int i = 127; i >= 0; i--) {//byt[0~127까지] 에 i값 대입 
			byt[127-i]=(byte) i;
		}
		
		//input에 byt값을 읽어내고
		ByteArrayInputStream input = new ByteArrayInputStream(byt);
		
		//output객체를 만들어 while문으로 int bte에 input값을 차례로 대입하여
		//output객체에 bte값을 대입함.
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		while ((bte= input.read())!= -1) {
			output.write(bte);
		}
		
		
		//남은 바이트 값을 반환함. input.available
		while (input.available() > 0) {
			output.write(input.read());
		}
		
		
		//바이트형  배열 bytout에 output의 바이트들을 배열로 반환된 값을 집어넣어줌.
		bytout = output.toByteArray();
		
		//배열의 toString으로  바이트형 배열 bytout을 넣어 나열하고, 출력함.
		System.out.println(Arrays.toString(bytout));
		
		
		
		
		
		
		
		
		
		
		
	}
}
