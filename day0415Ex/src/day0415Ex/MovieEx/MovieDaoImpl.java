package day0415Ex.MovieEx;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieDaoImpl implements MovieDao{
	private static MovieDaoImpl instance = new MovieDaoImpl();
	
	
	
	private MovieDaoImpl() {};
	
	public static MovieDaoImpl getInstance() {
		return instance;
	}
	
	@Override
	public Movie selectWithId(int id) {
		String sql = "select * from movie where id=?";
		Movie movie = null;
		try(PreparedStatement pstm = MyConnect.getConnect().prepareStatement(sql)){
			pstm.setInt(1, id);
			try(ResultSet rs = pstm.executeQuery()){
				rs.next();
				movie = new Movie(rs.getInt("id"), rs.getString("genre"), 
						rs.getString("director"), rs.getString("scenario"), rs.getString("title"),
						rs.getString("producer"), rs.getString("actor"), rs.getString("music"),
						rs.getDate("begin_filming"), rs.getDate("end_filming"),
						rs.getDate("release_date"), rs.getInt("running_time"),
						rs.getInt("production_cost"), rs.getInt("north_america_box_office"), 
						rs.getInt("world_box_office"), rs.getInt("korean_number_of_audience"),
						rs.getString("rate"), rs.getTimestamp("w_date"), rs.getTimestamp("u_date"));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return movie;
	}

	@Override
	public List<Movie> selectList() {
		Movie movie = new Movie();
		List<Movie> mList = new ArrayList<Movie>();
		String sql = "select * from movie";
		
		try(Statement st = MyConnect.getConnect().createStatement();
				ResultSet rs = st.executeQuery(sql)){
			while(rs.next()) {
				movie = new Movie(rs.getInt("id"), rs.getString("genre"), 
						rs.getString("director"), rs.getString("scenario"), rs.getString("title"),
						rs.getString("producer"), rs.getString("actor"), rs.getString("music"),
						rs.getDate("begin_filming"), rs.getDate("end_filming"),
						rs.getDate("release_date"), rs.getInt("running_time"),
						rs.getInt("production_cost"), rs.getInt("north_america_box_office"), 
						rs.getInt("world_box_office"), rs.getInt("korean_number_of_audience"),
						rs.getString("rate"), rs.getTimestamp("w_date"), rs.getTimestamp("u_date"));
			mList.add(movie);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return mList;
	}

	@Override
	public List<Movie> selectWithTitle() {
		String sql = "select * from movie where title like \"%?%\"";
		Scanner sc = new Scanner(System.in);
		Movie movie=null;
		List<Movie> mList = new ArrayList<Movie>();
		try(PreparedStatement pstm = MyConnect.getConnect().prepareStatement(sql)){
			System.out.println("검색하고자하는 영화제목을 입력해주세요.");
			String title = sc.nextLine();
			pstm.setString(1, title);
			try(ResultSet rs = pstm.executeQuery()){
				while(rs.next()) {
					movie = new Movie(rs.getInt("id"), rs.getString("genre"), 
							rs.getString("director"), rs.getString("scenario"), rs.getString("title"),
							rs.getString("producer"), rs.getString("actor"), rs.getString("music"),
							rs.getDate("begin_filming"), rs.getDate("end_filming"),
							rs.getDate("release_date"), rs.getInt("running_time"),
							rs.getInt("production_cost"), rs.getInt("north_america_box_office"), 
							rs.getInt("world_box_office"), rs.getInt("korean_number_of_audience"),
							rs.getString("rate"), rs.getTimestamp("w_date"), rs.getTimestamp("u_date"));
					mList.add(movie);
				}
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return mList;
	}

	@Override
	public int insert(Movie movie) {
		int result=0;
		Scanner sc = new Scanner(System.in);
		String sql = "insert into movie values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try(PreparedStatement pstm = MyConnect.getConnect().prepareStatement(sql)){
			pstm.setInt(1,movie.getId());
			pstm.setString(2,movie.getGenre());
			pstm.setString(3,movie.getDirector());
			pstm.setString(4,movie.getScenario());
			pstm.setString(5,movie.getTitle());
			pstm.setString(6,movie.getProducer());
			pstm.setString(7,movie.getActor());
			pstm.setString(8,movie.getMusic());
			pstm.setDate(9,movie.getBegin_filming());
			pstm.setDate(10,movie.getEnd_filming());
			pstm.setDate(11,movie.getRelease_date());
			pstm.setInt(12,movie.getRunning_time());
			pstm.setInt(13,movie.getProduction_cost());
			pstm.setInt(14,movie.getNorth_america_box_office());
			pstm.setInt(15,movie.getWorld_box_office());
			if(movie.getKorean_number_of_audience()==0) {
				pstm.setNull(16, movie.getKorean_number_of_audience());
			}else {
			pstm.setInt(16, movie.getKorean_number_of_audience());
			}
			pstm.setString(17,movie.getRate());
			pstm.setTimestamp(18,movie.getW_date());
			pstm.setTimestamp(19,movie.getU_date());
			result = pstm.executeUpdate();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int update(Movie movie) {
		String sql = "update movie set id=?";
		Scanner sc = new Scanner(System.in);
		int cnt=1;
		String genre = "";
		String director = "";
		String scenario = "";
		String title = "";
		String producer = "";
		String actor = "";
		String music = "";
		String begin_filming = "";
		String end_filming = "";
		String release_date = "";
		int running_time = -1;
		int production_cost = -1;
		int north_america_box_office = -1;
		int world_box_office = -1;
		int korean_number_of_audience = -1;
		String rate = "";
		String w_date = "";
		String u_date = "";
		int result = 0;
		
		
		
			System.out.println("수정할 id번호를 입력해주세요");
			int id = sc.nextInt();
			
			System.out.println(id+"번을 수정합니다.");
			sc.nextLine();
			System.out.println("장르를 수정하시겠습니까? 1 | 2");
			String genre_id = sc.nextLine();
			if(genre_id.equals("1")) {
				sql += ", genre=?";
				System.out.println("수정할 장르명을 적어주세요");
				genre = sc.nextLine();
				movie.setGenre(genre);
			}
			System.out.println("감독를 수정하시겠습니까? 1 | 2");
			String director_id = sc.nextLine();
			if(director_id.equals("1")) {
				sql += ", director=?";
				System.out.println("수정할 감독명을 적어주세요");
				director = sc.nextLine();
				movie.setDirector(director);
			}
			System.out.println("각본를 수정하시겠습니까? 1 | 2");
			String scenario_id = sc.nextLine();
			if(scenario_id.equals("1")) {
				sql += ", scenario=?";
				System.out.println("수정할 각본명을 적어주세요");
				scenario = sc.nextLine();
				movie.setScenario(scenario);
			}
			System.out.println("제목를 수정하시겠습니까? 1 | 2");
			String title_id = sc.nextLine();
			if(title_id.equals("1")) {
				sql += ", title=?";
				System.out.println("수정할 제목명을 적어주세요");
				title = sc.nextLine();
				movie.setTitle(title);
			}
			System.out.println("제작자를 수정하시겠습니까? 1 | 2");
			String producer_id = sc.nextLine();
			if(producer_id.equals("1")) {
				sql += ", producer=?";
				System.out.println("수정할 제작자명을 적어주세요");
				producer = sc.nextLine();
				movie.setProducer(producer);
			}
			System.out.println("출연배우를 수정하시겠습니까? 1 | 2");
			String actor_id = sc.nextLine();
			if(actor_id.equals("1")) {
				sql += ", actor=?";
				System.out.println("수정할 출연배우명을 적어주세요");
				actor = sc.nextLine();
				movie.setActor(actor);
			}
			System.out.println("음악감독을 수정하시겠습니까? 1 | 2");
			String music_id = sc.nextLine();
			if(music_id.equals("1")) {
				sql += ", music=?";
				System.out.println("수정할 음악감독명을 적어주세요");
				music = sc.nextLine();
				movie.setMusic(music);
			}
			System.out.println("촬영시작일을 수정하시겠습니까? 1 | 2");
			String begin_filming_id = sc.nextLine();
			if(begin_filming_id.equals("1")) {
				sql += ", begin_filming=?";
				System.out.println("수정할 촬영시작일을 적어주세요");
				begin_filming = sc.nextLine();
				movie.setBegin_filming(Date.valueOf(LocalDate.parse(begin_filming)));
			}
			System.out.println("촬영종료일을 수정하시겠습니까? 1 | 2");
			String end_filming_id = sc.nextLine();
			if(end_filming_id.equals("1")) {
				sql += ", end_filming=?";
				System.out.println("수정할 촬영종료일을 적어주세요");
				end_filming = sc.nextLine();
				movie.setEnd_filming(Date.valueOf(LocalDate.parse(end_filming)));
			}
			System.out.println("한국개봉일을 수정하시겠습니까? 1 | 2");
			String release_date_id = sc.nextLine();
			if(release_date_id.equals("1")) {
				sql += ", release_date=?";
				System.out.println("수정할 한국개봉일을 적어주세요");
				release_date = sc.nextLine();
				movie.setRelease_date(Date.valueOf(LocalDate.parse(release_date)));
			}
			System.out.println("상영시간을 수정하시겠습니까? 1 | 2");
			int running_time_id = sc.nextInt();
			if(running_time_id == 1) {
				sql += ", running_time=?";
				System.out.println("수정할 상영시간을 적어주세요");
				running_time = sc.nextInt();
				movie.setRunning_time(running_time);
				sc.nextLine();
			}
			System.out.println("제작비(달러)를 수정하시겠습니까? 1 | 2");
			int production_cost_id = sc.nextInt();
			if(production_cost_id==1) {
				sql += ", production_cost=?";
				System.out.println("수정할 제작비(달러)를 적어주세요");
				production_cost = sc.nextInt();
				movie.setProduction_cost(production_cost);
				sc.nextLine();
			}
			System.out.println("북미박스오피스를 수정하시겠습니까? 1 | 2");
			int north_america_box_office_id = sc.nextInt();
			if(north_america_box_office_id==1) {
				sql += ", north_america_box_office=?";
				System.out.println("수정할 북미박스오피스를 적어주세요");
				north_america_box_office = sc.nextInt();
				movie.setNorth_america_box_office(north_america_box_office);
				sc.nextLine();
			}
			System.out.println("월드박스오피스를 수정하시겠습니까? 1 | 2");
			int world_box_office_id = sc.nextInt();
			if(world_box_office_id==1) {
				sql += ", world_box_office=?";
				System.out.println("수정할 월드박스오피스를 적어주세요");
				world_box_office = sc.nextInt();
				movie.setWorld_box_office(world_box_office);
				sc.nextLine();
			}
			System.out.println("한국관객수를 수정하시겠습니까? 1 | 2");
			int korean_number_of_audience_id = sc.nextInt();
			if(korean_number_of_audience_id==1) {
				sql += ", korean_number_of_audience=?";
				System.out.println("수정할 한국관객수를 적어주세요");
				korean_number_of_audience = sc.nextInt();
				movie.setKorean_number_of_audience(korean_number_of_audience);
				sc.nextLine();
			}
			System.out.println("등급을 수정하시겠습니까? 1");
			String rate_id = sc.nextLine();
			if(rate_id.equals("1")) {
				sql += ", rate=?";
				System.out.println("수정할 등급을 적어주세요");
				rate = sc.nextLine();
				movie.setRate(rate);
			}
			System.out.println("작성일을 수정하시겠습니까? 1 | 2");
			String w_date_id = sc.nextLine();
			if(w_date_id.equals("1")) {
				sql += ", w_date=?";
				System.out.println("수정할 작성일을 적어주세요");
				w_date = sc.nextLine();
				movie.setW_date(Timestamp.valueOf(LocalDateTime.parse(w_date,DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))));
			}
			System.out.println("수정일을 수정하시겠습니까? 1 | 2");
			String u_date_id = sc.nextLine();
			if(u_date_id.equals("1")) {
				sql += ", u_date=?";
				System.out.println("수정할 수정일을 적어주세요");
				u_date = sc.nextLine();
				movie.setU_date(Timestamp.valueOf(LocalDateTime.parse(u_date,DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))));
			}
			
			sql+=" where id=?";
			try(PreparedStatement pstm = MyConnect.getConnect().prepareStatement(sql)){
			pstm.setInt(cnt++, id);
			if(!genre.equals("")) {
				pstm.setString(cnt++, genre);
			}
			if(!director.equals("")) {
				pstm.setString(cnt++, director);
			}
			if(!scenario.equals("")) {
				pstm.setString(cnt++, scenario);
			}
			if(!title.equals("")) {
				pstm.setString(cnt++, title);
			}
			if(!producer.equals("")) {
				pstm.setString(cnt++, producer);
			}
			if(!actor.equals("")) {
				pstm.setString(cnt++, actor);
			}
			if(!music.equals("")) {
				pstm.setString(cnt++, music);
			}
			if(!begin_filming.equals("")) {
				pstm.setString(cnt++, begin_filming);
			}
			if(!end_filming.equals("")) {
				pstm.setString(cnt++, end_filming);
			}
			if(!release_date.equals("")) {
				pstm.setString(cnt++, release_date);
			}
			if(running_time !=-1) {
				pstm.setInt(cnt++, running_time);
			}
			if(production_cost !=-1) {
				pstm.setInt(cnt++, production_cost);
			}
			if(north_america_box_office !=-1) {
				pstm.setInt(cnt++, north_america_box_office);
			}
			if(world_box_office !=-1) {
				pstm.setInt(cnt++, world_box_office);
			}
			if(korean_number_of_audience !=-1) {
				pstm.setInt(cnt++, korean_number_of_audience);
			}
			if(!rate.equals("")) {
				pstm.setString(cnt++, rate);
			}
			if(!w_date.equals("")) {
				pstm.setString(cnt++, w_date);
			}
			if(!u_date.equals("")) {
				pstm.setString(cnt++, u_date);
			}
			pstm.setInt(cnt, id);
			result = pstm.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int delete(int id) {
		String sql = "delete from movie where id = ?";
		int result =0;
		try(PreparedStatement pstm = MyConnect.getConnect().prepareStatement(sql)){
			pstm.setInt(1, id);
			
			result=pstm.executeUpdate();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int selectTotalCount() {
		String sql = "select count(*) from movie";
		int cnt=0;
		try(PreparedStatement pstm = MyConnect.getConnect().prepareStatement(sql);
				ResultSet rs = pstm.executeQuery()){
			while(rs.next()) {
				cnt=rs.getInt(1);
				
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}

}
