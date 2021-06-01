package day0416MarvelMovie;


import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.sql.Types;
import java.time.LocalDate;
import java.util.List;



public class MovieDaoImpl implements MovieDao{

	@Override
	public Movie selectWithId(int id) throws ClassNotFoundException, SQLException {
		String sql = "select * from movie where id=?";
		try(PreparedStatement pstm = MyConnect.getConnect().prepareStatement(sql)){
			pstm.setInt(1, id);
			try(ResultSet rs = pstm.executeQuery()){
				if(rs.next()) {
					Date beginFilmingDate = rs.getDate("begin_filming");
					LocalDate beginFilming = (beginFilmingDate == null) ? null : beginFilmingDate.toLocalDate();
					Date endFilmingDate = rs.getDate("end_filming");
					LocalDate endFilming = (endFilmingDate == null) ? null : endFilmingDate.toLocalDate();
					
					return new Movie.Builder()
							.setId(rs.getInt("id"))
							.setGenre(rs.getString("genre"))
							.setDirector(rs.getString("director"))
							.setScenario(rs.getString("scenario"))
							.setTitle(rs.getString("title"))
							.setProducer(rs.getString("producer"))
							.setActor(rs.getString("actor"))
							.setMusic(rs.getString("music"))
							.setRate(rs.getString("rate"))
							.setRunning_time(rs.getInt("running_time"))
							.setRelease_date(rs.getDate("release_date").toLocalDate())
							.setBegin_filming(beginFilming)
							.setEnd_filming(endFilming)
							.setProduction_cost(rs.getInt("production_cost"))
							.setNorth_america_box_office(rs.getLong("north_america_box_office"))
							.setWorld_box_office(rs.getLong("world_box_office"))
							.setKorean_number_of_audience(rs.getInt("korean_number_of_audience"))
							.setW_date(rs.getTimestamp("w_date").toLocalDateTime())
							.setU_date(rs.getTimestamp("u_date").toLocalDateTime())
							.build();
				}else {
					return null;
				}
			}
		}
	}

	@Override
	public List<Movie> selectList() throws ClassNotFoundException, SQLException {
		return null;
	}

	@Override
	public List<Movie> selectWithTitle() throws ClassNotFoundException, SQLException {
		return null;
	}

	@Override
	public int insert(Movie movie) throws ClassNotFoundException, SQLException {
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
			if(movie.getBegin_filming()!= null) {
				pstm.setString(9,movie.getBegin_filming().toString());
			}else {
				pstm.setNull(9, Types.NULL);
			}
			if(movie.getEnd_filming()!= null) {
				pstm.setString(10,movie.getEnd_filming().toString());
			}else {
				pstm.setNull(10, Types.NULL);
			}
			pstm.setString(11,movie.getRelease_date().toString());
			pstm.setInt(12,movie.getRunning_time());
			pstm.setInt(13,movie.getProduction_cost());
			pstm.setLong(14,movie.getNorth_america_box_office());
			pstm.setLong(15,movie.getWorld_box_office());
			if(movie.getKorean_number_of_audience()==0) {
				pstm.setNull(16, Types.NULL);
			}else {
			pstm.setInt(16, movie.getKorean_number_of_audience());
			}
			pstm.setString(17,movie.getRate());
			pstm.setTimestamp(18,Timestamp.valueOf(movie.getW_date()));
			pstm.setTimestamp(19,Timestamp.valueOf(movie.getU_date()));
			return pstm.executeUpdate();
		}
	}

	@Override
	public int update(Movie movie) throws ClassNotFoundException, SQLException {
		String sql = "update movie set id=? , genre=?, director=?, scenario=?, title=?, producer=?"
				+ ", actor=?, music=?, begin_filming=?, end_filming=?, release_date=?, running_time=?, production_cost=?, north_america_box_office=? "
				+ "world_box_office=?, korean_number_of_audience=?, rate=?,w_date=?, u_date;";
		try(PreparedStatement pstm = MyConnect.getConnect().prepareStatement(sql)){
			pstm.setInt(1,movie.getId());
			pstm.setString(2,movie.getGenre());
			pstm.setString(3,movie.getDirector());
			pstm.setString(4,movie.getScenario());
			pstm.setString(5,movie.getTitle());
			pstm.setString(6,movie.getProducer());
			pstm.setString(7,movie.getActor());
			pstm.setString(8,movie.getMusic());
			if(movie.getBegin_filming()!= null) {
				pstm.setString(9,movie.getBegin_filming().toString());
			}else {
				pstm.setNull(9, Types.NULL);
			}
			if(movie.getEnd_filming()!= null) {
				pstm.setString(10,movie.getEnd_filming().toString());
			}else {
				pstm.setNull(10, Types.NULL);
			}
			pstm.setString(11,movie.getRelease_date().toString());
			pstm.setInt(12,movie.getRunning_time());
			pstm.setInt(13,movie.getProduction_cost());
			pstm.setLong(14,movie.getNorth_america_box_office());
			pstm.setLong(15,movie.getWorld_box_office());
			if(movie.getKorean_number_of_audience()==0) {
				pstm.setNull(16, Types.NULL);
			}else {
			pstm.setInt(16, movie.getKorean_number_of_audience());
			}
			pstm.setString(17,movie.getRate());
			pstm.setTimestamp(18,Timestamp.valueOf(movie.getW_date()));
			pstm.setTimestamp(19,Timestamp.valueOf(movie.getU_date()));
			pstm.setInt(20,movie.getId());
			return pstm.executeUpdate();
		}
				
	}

	@Override
	public int delete(int id) throws ClassNotFoundException, SQLException {
		return 0;
	}

	@Override
	public int selectTotalCount() throws ClassNotFoundException, SQLException {
		return 0;
	}
}