package day0412Ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MyStatement {
	public static Statement getStatement() throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String id = "root";
			String pw = "mysql";
			String url = "jdbc:mysql://localhost:3306/tj_a?characterEncoding=utf-8&serverTimezone=Asia/Seoul";
 			Connection conn = DriverManager.getConnection(url,id,pw);
			Statement st = conn.createStatement();
			return st;
	}
}
