package day0407Homework;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyGugu {
	FileOutputStream fout= null;
	BufferedOutputStream bout = null;
	FileInputStream fin = null;
	BufferedInputStream bin = null;
	
	File file = new File("gugu.txt");
	public void makeGugufile() {
		try {
			byte[] write;
			int a=0;
			String ans;
			String get;
			fout = new FileOutputStream(file);
			bout = new BufferedOutputStream(fout);
			for (int i= 1; i <= 9; i++) {
				for (int j = 2; j <= 9; j++) {
					a=i*j;
					ans = j+" * "+i+" = "+a;
					write = ans.getBytes();
					bout.write(write);
					bout.write('\t');
					/*
					 * bout.write(j+'0');// j값에 char'0'을 더해줘서 아스키코드에 맞는 수를 write함.
					 * bout.write('*');
					 * bout.write(i+'0');
					 * bout.write('=');
					 * 
					 * if(i*j >= 10){
					 * bout.write(i*j/10+'0');//10의 자리에 char'0'을 더해 10의 자리 수를 표현
					 * bout.write(i*j%10+'0');// 1의 자리에 char'0'을 더해   1의 자리 수를 표현
					 * }else {
					 * bout.write(i*j+'0');	//1의 자리일 때 그 수에 char'0'을 더해 줌.
					 */
				}
				bout.write('\n');
			}
			bout.flush();
			System.out.println("구구단 생성완료.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void readGuguFile() {
		try {
			System.out.println("구구단 불러오기.");
			fin = new FileInputStream(file);
			bin = new BufferedInputStream(fin);
			while(bin.available()>0) {
				
				System.out.print((char)bin.read());
				
			}
			System.out.println("구구단 불러오기 끝.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
