package day0413.preparedStatementEx;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import day0413.dbconnect.MyConnect;

public class SelectMetadataEx {
	public static void main(String[] args) {
		String sql = "select id,name,user_id,password from employee";
		try(Connection conn = MyConnect.getConnect();
				PreparedStatement psmt = conn.prepareStatement(sql)){
			
			//컬럼 정보를 가져오는 아이!
			ResultSetMetaData rsmd = psmt.getMetaData();
			int columnCount = rsmd.getColumnCount();
			System.out.println("컬럼 수 : "+columnCount);
			for (int i = 1; i <= columnCount; i++) {
				System.out.print(rsmd.getColumnName(i)+":");
				System.out.print(rsmd.getColumnTypeName(i));
				System.out.println();
				
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
