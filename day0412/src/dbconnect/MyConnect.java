package dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnect {
	//커넥션을 반환해주는 메서드를 만들자.
	
	public static Connection getConnect() throws ClassNotFoundException, SQLException {
		Connection conn = null;
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String id = "root";
			String pw = "mysql";
			String url = "jdbc:mysql://localhost:3306/tj_a?"
					+"characterEncoding=utf-8&severTimezone=Asia/Seoul";
			
			return DriverManager.getConnection(url,id,pw);
	}
	
	
	
	
	
	
}
