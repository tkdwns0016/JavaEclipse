package day0405Ex;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class CopyTest {
	public static void main(String[] args) {
		byte[] ori = {10,9,8,7,6,5,4,3,2,1};
		byte[] bagagi = new byte[3];
		byte[] copy;
		int i,j,k;
		
		
		ByteArrayInputStream in = new ByteArrayInputStream(ori);
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		in.read(bagagi, 0, 3);
		out.write(bagagi, 0, bagagi.length);
		copy = out.toByteArray();
		in.read(bagagi, 0, 3);
		out.write(bagagi, 0, bagagi.length);
		copy = out.toByteArray();
		in.read(bagagi, 0, 3);
		out.write(bagagi, 0, bagagi.length);
		copy = out.toByteArray();
		bagagi = in.readAllBytes();
		out.write(bagagi, 0, bagagi.length);
		copy = out.toByteArray();
		System.out.println(Arrays.toString(copy));
		
		
		
		
	}
}
