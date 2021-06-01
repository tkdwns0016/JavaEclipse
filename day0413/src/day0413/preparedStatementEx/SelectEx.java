package day0413.preparedStatementEx;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import day0413.dbconnect.MyConnect;

public class SelectEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("user_id를 입력하세요");
		String userId=sc.nextLine();
		System.out.println("password를 입력하세요");
		String password=sc.nextLine();
		
		String sql = "select id, name, user_id,password,salary,hire_date"
				+ " from employee where user_id=? and password=?";
				
		
		try(Connection conn = MyConnect.getConnect();
				PreparedStatement pstm = conn.prepareStatement(sql)){
			//쿼리의 ?부분을 채운다.
			//문자열타입(홑따옴표가 붙은것) setString(몇번째 물음표인지, 대입할 값);
			//숫자타입 setInt(몇번째 물음표인지, 대입할 값);
			pstm.setString(1,userId);//첫번째 '?'부분에 userId를 대입
			pstm.setString(2, password);//두번째 '?'부분에 password를 대입
			
			try(ResultSet rs = pstm.executeQuery()){
				while(rs.next()) {
					String str="id : %d, name : %s, user_id : %s, password : %s,"
							+ " salary : %d, hire_date : %s";
					System.out.printf(str,rs.getInt("id"),rs.getString("name"),rs.getString("user_id"),rs.getString("password"),rs.getInt("salary"),rs.getString("hire_date"));
							
				}
			}
			
			
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
	}
}
