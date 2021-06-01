package day0323.stringEx01;

import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) {
		//글자의 위치를 판단하는 메서드
		String s1 = "I'm groot and i'm groot!";
		
		//groot의 시작 위치는?
		System.out.println("groot의 시작위치 : "+s1.indexOf("groot"));
		//indexOf("문자열")
		//찾는 값이 없다면 -1을 반환한다.
		
		
		//찾는 위치를 지정하는 방식
		System.out.println("2번째 groot의 위치는 : "+s1.indexOf("groot", 5));
		
		
		String s2 = "아기 상어 (뚜 루루 뚜루)" + "귀여운 (뚜 루루 뚜루)" + 
	            "바닷속 (뚜 루루 뚜루)" + 
	            "아기 상어" + 
	            "엄마 상어 (뚜 루루 뚜루)" + 
	            "어여쁜 (뚜 루루 뚜루)" + 
	            "바닷속 (뚜 루루 뚜루)" + 
	            "엄마 상어" + 
	            "아빠 상어 (뚜 루루 뚜루)" + 
	            "힘이 센 (뚜 루루 뚜루)" + 
	            "바닷속 (뚜 루루 뚜루)" + 
	            "아빠상어" + 
	            "할머니 상어 (뚜 루루 뚜루)" + 
	            "자상한 (뚜 루루 뚜루)" + 
	            "바닷속 (뚜 루루 뚜루)";
		
		//엄마 상어 라는 글자의 위치는?
		System.out.println(s2.indexOf("엄마 상어"));
		System.out.println(s2.indexOf("엄마 상어",47));
		
		System.out.println("-----바닷속 찾기-----");
		//for 문
//		int k=0;
//		int j=0;
//		for (int i = 0; i < s2.length(); i++) {
//			if (s2.indexOf("바닷속", j)>0) {
//				System.out.println(s2.indexOf("바닷속", j));
//				j = s2.indexOf("바닷속", j)+1;
//				k+=1;
//			}else if (s2.indexOf("바닷속", j)<0) {
//				break;
//				}
//		}
//		System.out.println("바닷속 은 "+k+"번");
		
		
		//while 문
		int start =0;	//바닷속이라는 글자의 시작위치를 넣기위한 변
		int cnt = 0;	//바닷속의 개수를 넣기위한 변수
		while (( start = s2.indexOf("바닷속",start))!= -1) {
			cnt++;
			System.out.println("위치 : "+start);
			start++;
		}
		System.out.println("바닷속 개수 : "+cnt);
		
		
		//문자열을 나누는 메서드.
		String s3 = "300,400,500,125,200";
		//,표를 기준으로 나눠 배열에 담는 메서드.
		String[] nums = s3.split(",");//인자로 정규식이 들어간다.
//		System.out.println(Arrays.toString(nums));
		for ( String string  : nums) {
			System.out.println(string);
		}System.out.println("------------");
		for ( String num : nums) {
			System.out.println(num);
		}
		System.out.println("------------");
		int tot=0;
		for (String string : nums) {
			tot += Integer.parseInt(string);
		}
		System.out.println("총합 : "+tot);
		System.out.println("------------");
		String s4 = "300+400+500";
		String[] nums2 = s4.split("\\+");	// "+"는 사용 불가지만  "\\+" 로 하면 가능하다.
		for ( String string : nums2) {
			System.out.println(string);
		}
		
		System.out.println("------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
