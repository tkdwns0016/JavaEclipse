package day0413.preparedStatementEx;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import day0413.dbconnect.MyConnect;

public class DeleteEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제하려는 id를 입력해주세요");
		int id = sc.nextInt();
		
		String sql = "delete from employee where id=?";
		
		try(Connection conn = MyConnect.getConnect();
				PreparedStatement pstm = conn.prepareStatement(sql)){
			
			pstm.setInt(1, id);
			int rows = pstm.executeUpdate();
			System.out.println(rows+"개 삭제 됨.");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
