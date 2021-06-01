package day0407.bufferedEx01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedIOExTest {
	public static void main(String[] args) {
		
		File file = new File("src/day0407/bufferedEx01/BufferedIOExTest");
		
		FileOutputStream fout = null;
		FileInputStream fin = null;
		BufferedOutputStream bout = null;
		BufferedInputStream bin = null;
		
		try {
			fout = new FileOutputStream(file);
			bout = new BufferedOutputStream(fout);
			for (int i = 1; i <= 100; i++) {
				bout.write(i);
			}
			bout.flush();
			fin = new FileInputStream(file);
			bin = new BufferedInputStream(fin);
			while(bin.available()>0) {
			System.out.println((char)bin.read());
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
