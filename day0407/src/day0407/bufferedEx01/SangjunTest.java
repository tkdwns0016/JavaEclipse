package day0407.bufferedEx01;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SangjunTest {
	public static void main(String[] args) {
		int[] image = null;
		File file1 = new File("C:/Users/Mr.KIM/Desktop/KakaoTalk_20201229_012205766.jpg");
		File file2 = new File("C:/Users/Mr.KIM/Desktop/010.jpg");
		try {
			FileInputStream fin = new FileInputStream(file1);
			BufferedInputStream bin = new BufferedInputStream(fin);
			while(bin.available()>0) {
				int a= 0;
				image[a] = bin.read();
				a++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
}
