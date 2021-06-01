package day0413.preparedStatementEx;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import day0413.dbconnect.MyConnect;

public class UpdateEx {
	public static void main(String[] args) {
		//사용자로부터 바꾸려는 컬럼을 수정할 수 있는 기능
		//update employee set 컬럼명 = 값 where id = 값
		Scanner sc = new Scanner(System.in);
		//사용자로 직접 컬럼명을 입력받는 방법.
		
		String sql = "update employee set id=? ";
		System.out.println("변경할 데이터의 id를 입력하세요.");
		String id = sc.nextLine();
		
		System.out.println("name을 변경하시겠습니까?(변경하지 않으면 엔터)");
		String name = sc.nextLine();
		if(!name.equals("")) {
			sql +=", name=?";
			//update employee set id=?, name=? 이 된 상태이다.
		}
		System.out.println("유저아이디를 변경하시겠습니까?(변경하지 않으면 엔터)");
		String userId= sc.nextLine();
		if(!userId.equals("")) {
			sql += ", user_id=?";
			//update employee set id=?, name=?, user_id이 된 상태이다.
		}
		
		System.out.println("비밀번호를 변경하시겠습니까?(변경하지 않으면 엔터)");
		String password = sc.nextLine();
		if(!password.equals("")) {
			sql+=", password=?";
		}
		
		
		System.out.println("연봉을 변경하시겠습니까?(변경하지 않으면 엔터)");
		String salary = sc.nextLine();
		if(!salary.equals("")) {
			sql +=", salary=?";
		}
		
		System.out.println("입사일을 변경하시겠습니까?(변경하지 않으면 엔터)");
		System.out.println("형식 : yyyy-MM-dd hh-mm-ss");
		System.out.println("예 : 2021-04-13 20-35-15");
		String hireDate = sc.nextLine();
		if(!hireDate.equals("")) {
			sql+=", hire_date=?";
		}
		
		sql +=" where id=?";
		
		try(PreparedStatement pstm = MyConnect.getConnect().prepareStatement(sql)){
			pstm.setInt(1, Integer.parseInt(id));
			int cnt=2;
			if(!name.equals("")) {
				pstm.setString(cnt++, name);
				
			}
			if(!userId.equals("")) {
				pstm.setString(cnt++, userId);
			}
			if(!password.equals("")) {
				pstm.setString(cnt++, password);
			}
			if(!salary.equals("")) {
				pstm.setString(cnt++, salary);
			}
			if(!hireDate.equals("")) {
				pstm.setString(cnt++, hireDate);
			}
			
			//마지막 where조건절의 id에 값을 넣음.
			pstm.setInt(cnt, Integer.parseInt(id));
			int rows = pstm.executeUpdate();
			System.out.println(rows+"개 수정 끝.");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
}
