package day0412.databaseEx01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectEx {
	public static void main(String[] args) {
		try {
			//드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//id , pw, url 생성
			String id = "root";
			String pw = "mysql";
			String url = "jdbc:mysql://localhost:3306/tj_a?"
					+ "characterEncoding=utf-8&serverTimezone=Asia/Seoul";
			
			Connection conn = DriverManager.getConnection(url, id,pw);
			
			String sql = "select * from employee";
			
			Statement st = conn.createStatement();
			
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
//				System.out.println(rs.getInt(1));
//				System.out.println(rs.getString("name"));
//				System.out.println(rs.getInt("salary"));
//				System.out.println(rs.getString("hire_date"));
//				System.out.println("----------------------");
				//클래스에 담아보고 출력도 해보자.
				Employee e = new Employee();
				e.setId(rs.getInt("id"));
				e.setName(rs.getString("name"));
				e.setSalary(rs.getInt("salary"));
				e.setHireDate(rs.getTimestamp("hire_date").toLocalDateTime());
				System.out.println(e);
			}
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
