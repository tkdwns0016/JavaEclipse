package day0402.status;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;



public class Ex01 {
	//크롤링..
	//day0402Ex 프로젝트 만들어서
	//URL 로 동행복권 회차별 당첨번호 페이지에서 최신 회차 당첨번호를
	//배열에 담아 출력하시오
	public static void main(String[] args) {
		URL url = null;
		InputStream is = null;
		BufferedReader br = null;
		String[] lotto_num = new String[7];
		try {
			String aa= "4</span>\r\n" + 
					"								<span class=\"ball_645 lrg ball2\">";
			
			String usernum;
			int start;
			int end;
			Scanner userpick = new Scanner(System.in);
			System.out.printf("검색할 회차를 적어주십시오.");
			usernum=userpick.next();
			url = new URL("https://www.dhlottery.co.kr/gameResult.do?method=byWin&drwNo="+usernum);
			is = url.openStream();
			br = new BufferedReader(new InputStreamReader(is,"euc-kr"));
			String s=null;
			for (int i = 0; i < 10000; i++) {
				s += br.readLine();
			}
			
//			start =s.indexOf(st)+st.length();
//			end = start+2;
			
			int key = s.indexOf("win_result");
			System.out.println(key);
			String ab = s.substring(key,key+1000);
			String st= "ball_645 lrg ball1\">";
			String en = "</span>";
			int j=0,k=0;
			int q=0;
			start= ab.indexOf(st)+st.length();
			System.out.println(start);
			end = ab.indexOf(en);
			for( int i =0; i<6; i++) {
				k=ab.indexOf(en, k);
				q= ab.indexOf(st,q);
				lotto_num[i]=ab.substring(q,k);
				q++;
				k++;
			}
			System.out.printf("당첨번호는 : ");
			for (int i = 0; i < 6; i++) {
				System.out.printf(lotto_num[i]+"  ");
			}
			st="<p><span class=\"ball_645 lrg ball4\">";
			start=s.indexOf(st)+st.length();
			end=start+2;
			lotto_num[6]=s.substring(start,end);
			System.out.println("보너스 번호는 : "+lotto_num[6]);
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}
	
	
	}
}
