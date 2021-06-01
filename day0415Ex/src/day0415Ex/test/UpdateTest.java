package day0415Ex.test;

import day0415Ex.MovieEx.Movie;
import day0415Ex.MovieEx.MovieDao;
import day0415Ex.MovieEx.MovieDaoImpl;

public class UpdateTest {
	public static void main(String[] args) {
		
		MovieDao md = MovieDaoImpl.getInstance();
		
		Movie movie = new Movie();
		
		System.out.println(md.update(movie));
		
	}
}
