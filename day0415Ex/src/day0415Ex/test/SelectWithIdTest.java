package day0415Ex.test;

import day0415Ex.MovieEx.Movie;
import day0415Ex.MovieEx.MovieDao;
import day0415Ex.MovieEx.MovieDaoImpl;

public class SelectWithIdTest {
	public static void main(String[] args) {
		MovieDao md = MovieDaoImpl.getInstance();
		Movie movie = new Movie();
		movie=md.selectWithId(2);
		System.out.println(movie);
	}
}
