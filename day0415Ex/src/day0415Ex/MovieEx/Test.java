package day0415Ex.MovieEx;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MovieDao md = MovieDaoImpl.getInstance();
		Movie movie = new Movie();
		int choose,select;
		while(true) {
			choose = 0;
			System.out.println("1. 조회, 2. 삽입, 3. 수정, 4. 삭제, 5. 종료하기");
			choose = sc.nextInt();
			switch(choose) {
			case 1:
				System.out.println("1. id조회, 2. List식 조회, 3. title검색 조회, 4. 전체 자료 갯수 조회, 5. 돌아가기");
				select = sc.nextInt();
				switch(select) {
				case 1:
					System.out.println("조회하고자 하는 아이디를 입력해 주세요.");
					int selectid = sc.nextInt();
					System.out.println(md.selectWithId(selectid));
					break;
				case 2:
					System.out.println(md.selectList());
					System.out.println("조회 완료.!");
					break;
				case 3:
					System.out.println(md.selectWithTitle());
					break;
				case 4:
					System.out.println("전체 자료의 갯수는 : "+md.selectTotalCount()+" 개 입니다.");
					break;
				case 5:
					break;
				}break;
			case 2:
				System.out.println("아이디 번호 입력");
				System.out.println("'0'입력시 순차적으로 번호");
				int id = sc.nextInt();
				movie.setId(id);
				sc.nextLine();
				System.out.println("장르 입력");
				String genre = sc.nextLine();
				movie.setGenre(genre);
				System.out.println("감독명 입력");
				String director = sc.nextLine();
				movie.setDirector(director);
				System.out.println("각본 입력");
				String scenario = sc.nextLine();
				movie.setScenario(scenario);
				System.out.println("제목 입력");
				String title = sc.nextLine();
				movie.setTitle(title);
				System.out.println("제작 입력");
				String producer = sc.nextLine();
				movie.setProducer(producer);
				System.out.println("출연배우 입력");
				String actor = sc.nextLine();
				movie.setActor(actor);
				System.out.println("음악감독 입력");
				String music = sc.nextLine();
				movie.setMusic(music);
				System.out.println("촬영시작일 입력");
				System.out.println("예시 : 2020-05-27");
				System.out.println("정보 없을 시 'null'입력.");
				String begin_filming = sc.nextLine();
				if(begin_filming.equals("null")) {

				}else {
					movie.setBegin_filming(Date.valueOf(LocalDate.parse(begin_filming)));
				}
				System.out.println("촬영종료일 입력");
				System.out.println("예시 : 2020-05-27");
				System.out.println("정보 없을 시 'null'입력.");
				String end_filming = sc.nextLine();
				if(end_filming.equals("null")) {

				}else {
					movie.setEnd_filming(Date.valueOf(LocalDate.parse(end_filming)));
				}
				System.out.println("한국개봉일 입력");
				System.out.println("예시 : 2020-05-27");
				String release_date = sc.nextLine();
				movie.setRelease_date(Date.valueOf(LocalDate.parse(release_date)));
				System.out.println("상영시간 입력");
				int running_time = sc.nextInt();
				movie.setRunning_time(running_time);
				sc.nextLine();
				System.out.println("제작비(달러) 입력");
				int production_cost = sc.nextInt();
				movie.setProduction_cost(production_cost);
				sc.nextLine();
				System.out.println("북미박스오피스 입력");
				int north_america_box_office = sc.nextInt();
				movie.setNorth_america_box_office(north_america_box_office);
				sc.nextLine();
				System.out.println("월드박스오피스 입력");
				int world_box_office = sc.nextInt();
				movie.setWorld_box_office(world_box_office);
				sc.nextLine();
				System.out.println("한국관객수 입력");
				System.out.println("정보 없을 시 '0'입력.");
				int korean_number_of_audience = sc.nextInt();
				movie.setKorean_number_of_audience(korean_number_of_audience);
				sc.nextLine();
				System.out.println("등급 입력");
				System.out.println("예시 : 전체, 12, 15, 19");
				String rate = sc.nextLine();
				movie.setRate(rate);
				System.out.println("작성일 입력");
				System.out.println("예시 2020-05-27 21:00:00");
				String w_date = sc.nextLine();
				movie.setW_date(Timestamp.valueOf(LocalDateTime.parse(w_date, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))));
				System.out.println("수정일 입력");
				System.out.println("예시 2020-05-27 21:00:00");
				String u_date = sc.nextLine();
				movie.setU_date(Timestamp.valueOf(LocalDateTime.parse(u_date, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))));
				System.out.println(md.insert(movie));
				break;

			case 3:
				System.out.println(md.update(movie)+"개의 작품 수정 완료.");
				break;
			case 4:
				System.out.println("삭제하실 아이디번호를 입력해주세요.");
				int deleteId = sc.nextInt();
				if(md.delete(deleteId)==1) {
					System.out.println("삭제 완료.");
				}else {
					System.out.println("삭제 실패.");
				}
				break;
			case 5:
				break;
			}if(choose == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}
}