package test;

import homework.user.UserDaoImpl;

public class UserDaoTest {
	public static void main(String[] args) {
//		UserDao dao1 = new UserDao();
//		UserDao dao2 = new UserDao();
		//이미 생성된 객체를 받는다.
		UserDaoImpl dao = UserDaoImpl.getInstance();
	}
}
