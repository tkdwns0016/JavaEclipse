package day0412.databaseEx01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class InsertEx {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String id = "root";
			String pw = "mysql";
			String url = "jdbc:mysql://localhost:3306/tj_a?"
					+"characterEncoding=utf-8&severTimezone=Asia/Seoul";
			
			Connection conn = DriverManager.getConnection(url,id,pw);
			
			
			Statement st = conn.createStatement();
			
			String sql = "insert into employee(id,name,salary,hire_date)"
					+ " values(0,'소나',21000000,'2021-04-12 14:39:30');";
			
			
			int affectedRows = st.executeUpdate(sql);
			
			if(affectedRows >0) {
				System.out.println("삽입 성공");
			}else {
				System.out.println("삽입 실패");
			}
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
