package day0408.readerWriterEx02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex02 {
	public static void main(String[] args) {
		File file = new File("src/day0408/readerWriterEx02","test.txt");
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			String s=null; //문자열 s를 null로 초기화.
//			br.readLine()//(한 Line 읽기)개행이 있을 때까지 읽어줌.
			
			while((s = br.readLine()) != null) {// s에 br.readLine값을 넣어주고 읽을값이 없을때 null을 반환해주므로 null이 아닐때 까지 돌림. br.readLine을 한번 쓸때마다 값이 빠져나가므로 항상 주의할 것.
				System.out.println(s);//문자열에 넣은 값을 보기위해 문자열 s 를 프린트.
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
