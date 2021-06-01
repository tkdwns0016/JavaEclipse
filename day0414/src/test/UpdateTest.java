package test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import homework.user.User;
import homework.user.UserDao;
import homework.user.UserDaoImpl;

public class UpdateTest {
	public static void main(String[] args) {
		
		UserDao dao = UserDaoImpl.getInstance();
		
		User user = new User(4, "오로치마루", "주인", LocalDate.parse("1950-05-05"), "010-1234-1234", "숲속", LocalDateTime.parse("1970-01-01T09:01:01"));
		
		int row = dao.update(user);
		User search = new User();
		search.setUserId("오로치마루");
		
		System.out.println(dao.selectWithUserId(search));
		
		
		
		
		
		
	}
}
