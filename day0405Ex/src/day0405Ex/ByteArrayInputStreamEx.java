package day0405Ex;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamEx {
	public static void main(String[] args) {
		//바이트배열에 0~127까지 넣고 0~127을 읽어보기
		byte[] buf = new byte[128];
		
		for (int i = 0; i < buf.length; i++) {
			buf[i]=(byte) i;
		}
		
		ByteArrayInputStream bais = new ByteArrayInputStream(buf);
		int nais = -1;
		
		while ((nais =bais.read())!= -1) {
		System.out.println(nais);
		}
		
		
		
		
		
		
		
		
		
		
	}
}
