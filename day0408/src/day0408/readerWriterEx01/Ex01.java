package day0408.readerWriterEx01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex01 {
	public static void main(String[] args) {
		File file = new File("src/day0408/readerWriterEx01","hello.txt");
		
		
		try(FileWriter fw = new FileWriter(file)){
			fw.write("글자를 넣을수 있습니다.");
			fw.flush();
			System.out.println("생성완료.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try(FileReader fr = new FileReader(file)){
//			System.out.println((char)fr.read());//한번 read하면 2바이트 읽는것을 알 수 있다.
			int a = -1;
			while((a = fr.read()) != -1) {
				System.out.print((char)a);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
