package day0402.status;

import java.util.List;

public class LottoTest {
	public static void main(String[] args) {
		MyLotto mylotto = new MyLotto();
		
		
		List<String> lotto = mylotto.getWinNumbers(941);
		
		System.out.println(lotto.toString());
		
		
		String[] myNums = {"12","14","39","24","41","45"};
		System.out.println("당첨 번호 확인");
		for (String num : myNums) {
			if(lotto.contains(num)) {
				System.out.print(num+"  ");
			}
		}
	}
}