package day0415Ex.test;

import day0415Ex.MovieEx.MovieDao;
import day0415Ex.MovieEx.MovieDaoImpl;

public class SelectList {
	public static void main(String[] args) {
		MovieDao md = MovieDaoImpl.getInstance();
		
		System.out.println(md.selectList());
	}
}
