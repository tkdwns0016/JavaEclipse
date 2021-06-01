package day0416MarvelMovie;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class UpdateTest {
	public static void main(String[] args) {
		//수정 해보자
		MovieDao dao = new MovieDaoImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("수정하고자 하는 id값을 입력하세요");
		int id=Integer.parseInt(sc.nextLine());
		
		try {
			Movie m = dao.selectWithId(id);
			
			System.out.println("수정할 제목을 입력하세요.");
			String title = sc.nextLine();
			
			Movie newMovie = new Movie.Builder()
					.setId(m.getId())
					.setGenre(m.getGenre())
					.setDirector(m.getDirector())
					.setScenario(m.getScenario())
					.setTitle(title)
					.setProducer(m.getProducer())
					.setActor(m.getActor())
					.setMusic(m.getMusic())
					.setBegin_filming(m.getBegin_filming())
					.setEnd_filming(m.getEnd_filming())
					.setRelease_date(m.getRelease_date())
					.setRunning_time(m.getRunning_time())
					.setProduction_cost(m.getProduction_cost())
					.setNorth_america_box_office(m.getNorth_america_box_office())
					.setWorld_box_office(m.getWorld_box_office())
					.setKorean_number_of_audience(m.getKorean_number_of_audience())
					.setRate(m.getRate())
					.setW_date(m.getW_date())
					.setU_date(LocalDateTime.now())
					.build();
			
			dao.update(newMovie);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
