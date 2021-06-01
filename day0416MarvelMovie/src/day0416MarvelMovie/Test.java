package day0416MarvelMovie;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		MovieDao dao = new MovieDaoImpl();
		Scanner sc = new Scanner(System.in);
		try {
			while(true) {
				System.out.println("영화의 정보를 입력하세요");
				System.out.println("id를 입력하세요. 자동: 0");
				int id = Integer.parseInt(sc.nextLine());
				System.out.println("장르를 입력하세요");
				String genre = sc.nextLine();
				System.out.println("감독을 입력하세요");
				String director = sc.nextLine();
				System.out.println("각본을 입력하세요");
				String scenario = sc.nextLine();
				System.out.println("제목을 입력하세요");
				String title = sc.nextLine();
				System.out.println("제작을 입력하세요");
				String producer = sc.nextLine();
				System.out.println("출연배우를 입력하세요");
				String actor = sc.nextLine();
				System.out.println("음악감독을 입력하세요");
				String music = sc.nextLine();
				System.out.println("제작 시작일을 입력하세요");
				String beginFilming = sc.nextLine();
				System.out.println("제작 종료일을 입력하세요");
				String endFilming = sc.nextLine();
				System.out.println("국내개봉일을 입력하세요");
				String releaseDate = sc.nextLine();
				System.out.println("상영시간을 입력하세요");
				String runningTime = sc.nextLine();
				System.out.println("제작비용을 입력하세요");
				String productionCost = sc.nextLine();
				System.out.println("북미박스오피스를 입력하세요");
				String northAmericaBoxOffice = sc.nextLine();
				System.out.println("월드박스오피스를 입력하세요");
				String worldBoxOffice = sc.nextLine();
				System.out.println("한국 총 관객수를 입력하세요");
				String koreanNumberOfAudience = sc.nextLine();
				System.out.println("관람 등급을 입력하세요 (전체,12,15,19)");
				String rate = sc.nextLine();
				System.out.println("작성일을 입력하세요 yyyy-MM-dd HH:mm:ss (자동: 엔터)");
				String wDate = sc.nextLine();
				System.out.println("수정일을 입력하세요 yyyy-MM-dd HH:mm:ss (자동: 엔터)");
				String uDate = sc.nextLine();
				
				LocalDate beginFilmingLD = null;
				if(!beginFilming.equals("")) {
					beginFilmingLD = LocalDate.parse(beginFilming);
				}
				
				LocalDate endFilmingLD = null;
				if(!endFilming.equals("")) {
					endFilmingLD = LocalDate.parse(endFilming);
				}
				LocalDateTime wDateLDT =LocalDateTime.now();
				if(!wDate.equals("")) {
					wDateLDT = LocalDateTime.parse(wDate,DateTimeFormatter.ofPattern("yyyy-MM-DD HH:mm:ss"));
				}
				LocalDateTime uDateLDT =LocalDateTime.now();
				if(!uDate.equals("")) {
					uDateLDT = LocalDateTime.parse(uDate,DateTimeFormatter.ofPattern("yyyy-MM-DD HH:mm:ss"));
				}
				Movie m = new Movie.Builder()
						.setId(id)
						.setGenre(genre)
						.setDirector(director)
						.setScenario(scenario)
						.setTitle(title)
						.setProducer(producer)
						.setActor(actor)
						.setMusic(music)
						.setBegin_filming(beginFilmingLD)
						.setEnd_filming(endFilmingLD)
						.setRelease_date(LocalDate.parse(releaseDate))
						.setRunning_time(Integer.parseInt(runningTime))
						.setProduction_cost(Integer.parseInt(productionCost))
						.setNorth_america_box_office(Long.parseLong(northAmericaBoxOffice))
						.setWorld_box_office(Long.parseLong(worldBoxOffice))
						.setKorean_number_of_audience(Integer.parseInt(koreanNumberOfAudience))
						.setRate(rate)
						.setW_date(wDateLDT)
						.setU_date(uDateLDT)
						.build();
				//디비에 삽입.
				dao.insert(m);
				System.out.println("종료하시겠습니까? y/n");
				if(sc.nextLine().equals("y")) {
					break;
				}
			}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
