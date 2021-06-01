package day0413.stastement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import day0413.dbconnect.MyConnect;
public class SelectEx {
	public static void main(String[] args) {
		//사용자로 부터 id를 입력받아서 해당되는 사람을 조회.
		Scanner sc = new Scanner(System.in);
		System.out.println("유저 아이디를 입력하세요.");
		String userId = sc.nextLine();
		System.out.println("비밀번호를 입력하세요");
		String password = sc.nextLine();
		String sql = "select * from employee where user_id='"+userId+"'"
				+ " and password='"+password+"'";

		try(Connection conn = MyConnect.getConnect();
				Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery(sql)){

			while(rs.next()) {
				System.out.println(rs.getInt("id"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString("user_id"));
				System.out.println(rs.getString("password"));
				System.out.println(rs.getInt("salary"));
				System.out.println(rs.getTimestamp("hire_date"));
				System.out.println("-------------------------");
			}



		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
