package day0407Ex;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex02 {
	public static void main(String[] args) {
		//날짜를 관리하는 클래스!
		//date , calendar ... 등이 있다. <-꼭 찾아서 써보는정도로 해볼것!
		//LocalDate 와  LocalDateTime이 있음.
		LocalDate now = LocalDate.now();
		System.out.println("연도 : "+now.getYear());
		System.out.println("월 : "+now.getMonthValue());//그냥 getmonth는 영어로 나오고, value가 붙으면 숫자가 나온다.
		System.out.println("일 : "+now.getDayOfMonth());
//		System.out.println(now.getDayOfYear()); // 는 2021/01/01 부터 일수로 따진것을 반환해줌.
		LocalDateTime nowTime = LocalDateTime.now();
		System.out.println("시 : "+nowTime.getHour());
		System.out.println("분 : "+nowTime.getMinute());
		System.out.println("초 : "+nowTime.getSecond());
		
		//숫자로 처리하기 위해 변수로 받기.
		int year = nowTime.getYear();
		int month = nowTime.getMonthValue();//1,2,3,4,5 로나오는걸 01,02,03,04,05로 나오게끔 바꿀 필요가 있음.
		int day = nowTime.getDayOfMonth();
		//format()날짜의 형태를 지정해주는 아이이다.
		//DateTimeFormatter.ofPattern(날짜를 표기할 패턴)을 넣어주면 됨.
		String path = nowTime.format(DateTimeFormatter.ofPattern("YYYY/MM/dd"));
		String fileName = "testMyFile";
		File filePath = new File(path);
		if (!filePath.exists()) {
			filePath.mkdirs();
		}
		filePath = new File(path,fileName);
		try {
			filePath.createNewFile();
			System.out.println("파일 생성 완료");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
