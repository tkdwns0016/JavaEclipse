package day0408Ex;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class Ex01 {
	public static void main(String[] args) {
		File file = new File("src/day0408Ex","zz");
		
		try (DataOutputStream dout = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)))){
			
			byte b = 20; 
			int i = 2000000000;
			boolean bo1 = true;
			boolean bo2 = false;
			double d = 3.1444444;
			char c = 'z';
			float f = (float) 0.11;
			long l = 2000000000;
			short s = (short) 200;
			String str = "안녕하세요";
			dout.writeByte(b);
			dout.writeInt(i);
			dout.writeBoolean(bo1);
			dout.writeBoolean(bo2);
			dout.writeDouble(d);
			dout.writeChar(c);
			dout.writeFloat(f);
			dout.writeLong(l);
			dout.writeShort(s);
			dout.writeUTF(str);
			System.out.println("입력 끝.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
