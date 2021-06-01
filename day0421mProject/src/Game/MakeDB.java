package Game;

import java.sql.SQLException;
import java.sql.Statement;

public class MakeDB {
	public static void main(String[] args) {
		String sql1 = "create database BJ";
		String sql2 = "use BJ";
		String sql3 = "create table user values(id varchar(10),password varchar(20),rating ENUM('브론즈', '실버', '골드', '플래티넘', '다이아몬드', '그랜드마스터', '챌린저'),money int)";
		
		try(Statement st = MyConnect.getConnect().createStatement()){
			st.executeUpdate(sql1);
			st.executeUpdate(sql2);
			st.executeUpdate(sql3);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
