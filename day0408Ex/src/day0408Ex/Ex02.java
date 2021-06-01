package day0408Ex;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex02 {
	public static void main(String[] args) {
		File file = new File("src/day0408Ex","zz");
		
		try (DataInputStream din = new DataInputStream(new BufferedInputStream(new FileInputStream(file)))){
			byte b = din.readByte();
			int i = din.readInt();
			boolean bo1 = din.readBoolean();
			boolean bo2 = din.readBoolean();
			double d = din.readDouble();
			char c = din.readChar();
			float f = din.readFloat();
			long l = din.readLong();
			short s = din.readShort();
			String str = din.readUTF();
			
			
			System.out.println("byte : "+b);
			System.out.println("int : "+i);
			System.out.println("boolean : "+bo1);
			System.out.println("boolean : "+bo2);
			System.out.println("double : "+d);
			System.out.println("char : "+c);
			System.out.println("float : "+f);
			System.out.println("long : "+l);
			System.out.println("short : "+s);
			System.out.println("String : "+str);
			
			
			System.out.println("불러오기 끝");
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
