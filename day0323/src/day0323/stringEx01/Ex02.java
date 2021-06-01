package day0323.stringEx01;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		//String 에는 여러가지 메서드를 갖고있음.
		//대소문자 변경
		String alpha = "abcdefg";
		System.out.println(alpha.toUpperCase());
		alpha="aAbCdEfG";
		System.out.println(alpha.toLowerCase());
		
		
		char[] sArr = alpha.toCharArray();
		System.out.println(Arrays.toString(sArr));

		String result ="";	//charAt(0) 문자열 중에 0번째 글자를 선택한다.
		if(alpha.charAt(0) <= 'z' && alpha.charAt(0) >= 'a') {
			//sArr[0] -= 32;  
			
			//replaceFirst는 앞문자를 선택 ( 0번째 문자열을 , 0번째문자에서 -32를 해서 대문자로 바꾼다. ) 
			// [ +"" ] 는 char형으로 변환된 것을 다시 String형으로 바꾸기 위함이다.
			result = alpha.replaceFirst(alpha.charAt(0)+"", ((char)(alpha.charAt(0)-32))+"");
		}  
		System.out.println(result);
		
		
		//문자열 자르기		h = 0번째 글자 , w는 12번째 글자.
		String str1 = "hello world,welcome to my house.";
		System.out.println(str1.substring(12));		// 입력한 시작 인덱스부터 끝까지 자름
		System.out.println(str1.substring(12, 19));	// (시작인덱스 (포함), 끝인덱스(불포함));
		
	}
}