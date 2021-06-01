package day0416.Ex;


import java.util.List;

public interface MovieDao {
	public Movie selectWithId(int id);
	
	public List<Movie> selectList();
	
	public List<Movie> selectWithTitle();
	
	public int insert(Movie movie);
	
	public int update(Movie movie);
	
	public int delete(int id);
	
	public int selectTotalCount();
	
}
