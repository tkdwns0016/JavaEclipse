package day0412Ex;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Scanner;

public class MySqlEx01 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		int select=0;
		String selectname=null;
		int id;
		String name;
		String date;
		int kor;
		int eng;
		int math;
		Scanner sc = new Scanner(System.in);
		while(true) {
			Student st = new Student();
			System.out.println("1.업무 실행\t 2.종료.");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("1.삽입, 2.조회, 3.수정, 4.삭제");
				select = sc.nextInt();
				switch(select) {
				case 1: 
					System.out.println("이름을 입력해주세요");
					name = sc.next();
					System.out.println("생년월일을 입력해주세요.");
					date = sc.next();
					System.out.println("국어점수을 입력해주세요.");
					kor = sc.nextInt();
					System.out.println("영어점수을 입력해주세요.");
					eng = sc.nextInt();
					System.out.println("수학점수을 입력해주세요.");
					math = sc.nextInt();
					st.insert(name,LocalDate.parse(date),kor,eng,math);
					break;
				case 2:
					System.out.println("조회할 대상의 이름을 검색해주세요.");
					System.out.println("이름 = 이름 검색 \t all = 모든 대상 검색");
					selectname = sc.next();
					try {
						st.select(selectname);
						break;
						
					} catch (ClassNotFoundException | SQLException e) {
						
						System.out.println("내용이 비어있습니다.");
						break;
					}
				case 3:
					System.out.println("수정할 id 번호를 입력해주세요.");
					id = sc.nextInt();
					System.out.println("이름을 입력해주세요");
					name = sc.next();
					System.out.println("생년월일을 입력해주세요.");
					date = sc.next();
					System.out.println("국어점수을 입력해주세요.");
					kor = sc.nextInt();
					System.out.println("영어점수을 입력해주세요.");
					eng = sc.nextInt();
					System.out.println("수학점수을 입력해주세요.");
					math = sc.nextInt();

					st.update(name,LocalDate.parse(date),kor,eng,math,id);
					break;
				case 4:
					System.out.println("삭제할 id 번호를 입력해주세요.");
					int deletenum = sc.nextInt();
					st.delete(deletenum);
					break;
				}

			case 2:
				System.out.println("시스템을 종료합니다.");
				break;
			}
			if(choice == 2) {
				break;
			}
		}
	}
}
