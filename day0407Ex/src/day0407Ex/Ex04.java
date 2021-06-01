package day0407Ex;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04 {
	public static void main(String[] args) {
		byte[] byt;
		File file = new File("..\\day0407\\src\\day0407\\bufferedEx02/FileCopyEx01.java");
		FileInputStream fin = null;
		
		try(BufferedInputStream bin=new BufferedInputStream(fin=new FileInputStream(file));
				BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream(new File("src/day0407/bufferedEx02/FileCopyEx01.java")));){
			byt = bin.readAllBytes();
			bout.write(byt,0,byt.length);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
