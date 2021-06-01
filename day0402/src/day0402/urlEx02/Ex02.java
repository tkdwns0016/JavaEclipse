package day0402.urlEx02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;



public class Ex02 {
	public static void main(String[] args) {
		URL url = null;				//url로의 접속을 도와주는 클래스
		URLConnection conn= null;	//접속한 데이터(정보)를 보여줌.
		InputStream is = null;		//읽어오는 아이
		BufferedReader br = null;	//읽어오는 아이
		try {
			//동행복권 사이트
			url = new URL("https://www.dhlottery.co.kr/gameResult.do?method=byWin&wiselog=H_C_1_1");//동행복권 주소.
			conn = url.openConnection();	// 문서의 정보, 타입을 알아오기 위한 접속 
			System.out.println("크기 : "+conn.getContentLength());
			
			//문서를 가져와 보자.
			is = url.openStream();	//문서를 읽어오는 아이
			br = new BufferedReader(new InputStreamReader(is,"euc-kr"));//성능이 더 좋은아이에 넣어줌.
			
			String s=null;
			String docs = null;
			for (int i = 0; i < 26; i++) {
				System.out.println(br.readLine());// 한줄을 읽어온다.
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
