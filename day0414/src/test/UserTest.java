package test;

import java.sql.SQLException;

import homework.user.MyConnect;

public class UserTest {
	public static void main(String[] args) {
		
		try {
			System.out.println(MyConnect.getConnect());
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
