package day0323.stringEx01;

public class Ex04 {
	public static void main(String[] args) {
		//일정 규칙이 있는 문자 추출
		String[] sArr = new String[4];
		sArr[0]="<div>hello world!</div>";
		sArr[1]="<html><span>test</span><div>Im groot</div></html>";
		sArr[2]="<html><span>test</span><div>fire it up!</div></html>";
		sArr[3]="<html><section><div>Ready to roll out!</div></section></html>";
		//위 코드에서 <div></div> 사이에 있는 글자를 추출하여 출력하시오!!
//		for(int i=0; i<sArr.length; i++) {
//			int start =sArr[i].indexOf("<div>")+4;
//			int end = sArr[i].indexOf("</div>");
//			System.out.println(sArr[i].substring(start, end));
//		}
		String startStr = "<div>";
		String endStr = "</div>";
		for(int i =0; i<sArr.length; i++) {
		int startIndex = sArr[i].indexOf(startStr)+startStr.length();	//tip : +startStr.length()를 함으로써 나중에 startStr 의 값이 바뀌더라도 수정할 일이 없어짐. 
		int endIndex=sArr[i].indexOf(endStr);
		System.out.println(sArr[i].substring(startIndex,endIndex));
		}
		
	}
}
