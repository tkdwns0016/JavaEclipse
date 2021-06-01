package day0408.readerWriterEx02;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex01 {
	public static void main(String[] args) {
		File file = new File("src/day0408/readerWriterEx02","test.txt");
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
			for (int i = 1; i < 10; i++) {
				for (int j =2; j < 10; j++) {
					bw.write(j+" * "+i+" = "+(i*j)+"\t");
					
				}
				bw.newLine(); //파일에 개행처리함. \n
			}
			bw.flush();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
				
				
				
	}
}
