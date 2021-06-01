package day0413.preparedStatementEx;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Scanner;

import day0413.dbconnect.MyConnect;

public class InsertEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("이름을 입력하세요");
		String name=sc.nextLine();
		System.out.println("유저아이디를 입력하세요");
		String userId=sc.nextLine();
		System.out.println("비밀번호를 입력하세요");
		String password = sc.nextLine();
		System.out.println("연봉을 입력하세요");
		int salary = sc.nextInt();
		System.out.println("입사일을 입력하세요 yyyy-MM-dd HH:mm:ss 형태로 ");
		sc.nextLine();//위에서 남은 \n을 한번 날려서 밑에 hireDate가 입력받을 수 있게 함.
		String hireDate = sc.nextLine();

		String sql = "insert into employee(name,user_id, password,salary,hire_date)"
				+ " values(?,?,?,?,?)";

		try(Connection conn = MyConnect.getConnect();
				PreparedStatement pstm = conn.prepareStatement(sql)){
			
			//물음표 값 세팅.
			pstm.setString(1, name);	//setString 은 위의 물음표값을 문자열로 할것이냐는 것.
			pstm.setString(2, userId);	// 'userId'처럼 홑따옴표가 붙어서 들어가게 된다.
			pstm.setString(3, password);
			pstm.setInt(4, salary);
			pstm.setString(5, hireDate);
			
			//쿼리 실행.
			int affectedRows = pstm.executeUpdate();
			System.out.println(affectedRows+"의 row를 삽입했습니다.");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("삽입을 실패했습니다.");
			e.printStackTrace();
		}



	}
}
