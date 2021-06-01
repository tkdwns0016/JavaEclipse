package day0402.status;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


public class MyLotto {
	public List<String> getWinNumbers(int round){
		List<String> lotto = new ArrayList<String>();
		BufferedReader br = null;
		try {
			URL url = new URL("https://www.dhlottery.co.kr/gameResult.do?method=byWin&drwNo="+round);
			
			//접속된 사이트의 문자들을 읽어와 주는 아이를 생성
			br = new BufferedReader(new InputStreamReader(url.openStream(),"euc-kr"));
			
			//한 줄씩 읽어 문자열에 추가한다.
			StringBuffer sb = new StringBuffer();
			String s = null;
			//문자열을 한줄 씩 읽어 s에 담음.
			while((s = br.readLine())!=null) {
				sb.append(s); // sb에 읽어온 한 줄을 추가한다.			
			}
			
			//읽어 들인 문자열을 String 형태로 변경.
			String docs = sb.toString();
			
			//문서에서 로또번호가 있는 부분을 추출. "win_result"라는 부분은 단 한곳.
			docs = docs.substring(docs.indexOf("win_result"));
			int spanStartIndex = 0; 
			int spanIndex = 0;
			int startIndex = 0;
			int endIndex = 0;
			for(int i = 0 ; i<7; i++) {
			spanIndex = docs.indexOf("<span",spanStartIndex);
			startIndex = docs.indexOf(">",spanIndex)+1;//>다음이 숫자이기 때문에 +1해준다. "<span"에서 부터 ">"를 찾겠다.
			endIndex = docs.indexOf("</span>",startIndex);
			lotto.add(docs.substring(startIndex,endIndex));
			spanStartIndex = endIndex;
			}
			
			
		}catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
		return lotto;
	}



}
