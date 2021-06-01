package Ex;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import day0413.dbconnect.MyConnect;

public class User {
	private int id;
	private String userId;
	private String password;
	private Date birth_date;
	private String phone;
	private String address;
	private Timestamp joined_date;
	Scanner sc = new Scanner(System.in);



	public static void main(String[] args) {
		while(true) {
			Scanner msc = new Scanner(System.in);
			System.out.println("안녕하세요.");
			System.out.println("1 : 둘러보기, 2 : 회원가입, 3: 종료");
			String choose = msc.nextLine();
			if(choose.equals("1")) {
				while(true) {
					System.out.println("무엇을 하시겠습니까.");
					System.out.println("1.select1 - 유저 아이디를 이용하여 검색.");
					System.out.println("2.select2 - 검색한 내용을 유저 객체에 넣은 뒤 리스트에 넣어서 보여줌.");
					System.out.println("3.select3 - 리스트 객체에 user객체 없이 넣어서 보여줌.");
					System.out.println("4.update - 내용을 업데이트 하기 위한 설정");
					System.out.println("5.insert - 새로운 사람 추가");
					System.out.println("6.delete - id번호를 입력해 해당 id번호의 대상 삭제");
					System.out.println("7.총 인원 검색 - 총 가입된 사람이 몇명인지 보여줌.");
					System.out.println("8.무슨 컬럼이 있는지 보여줌.");
					System.out.println("0. 처음으로 돌아가기.");
					int a = msc.nextInt();
					User user = new User();
					if(a==0) {
						System.out.println("처음으로 돌아갑니다.");break;
					}
					switch(a) {
					case 1: user.selectWithUserId();break;
					case 2:	user.selectList1();break;
					case 3: user.selectList();break;
					case 4: user.update();break;
					case 5: user.insert();break;
					case 6: user.delete();break;
					case 7: user.HowManyUsers();break;
					case 8: user.WhatColumn();break;
					}
				}
			}else if(choose.equals("2")) {
				System.out.println("사용할 아이디를 입력해주세요.");
				String userId = msc.nextLine();
				System.out.println("사용할 패스워드를 입력해주세요.");
				String password = msc.nextLine();
				System.out.println("생년월일을 입력해주세요.");
				System.out.println("예시 : 2021-04-13");
				String birthdate= msc.nextLine();
				
				System.out.println("휴대폰 번호를 입력해주세요.");
				String phone = msc.nextLine();
				System.out.println("사용할 주소를 입력해주세요.");
				String address = msc.nextLine();
				System.out.println("사용할 입력날짜를 입력해주세요.");
				System.out.println("예시 : 2021-04-13T17:00:00");
				String joindate = msc.nextLine();
			
				User user = new User(0,userId, password, Date.valueOf(LocalDate.parse(birthdate)), phone, address, Timestamp.valueOf(LocalDateTime.parse(joindate)));
				user.insertuser();
			}else if(choose.equals("3")){
				System.out.println("종료합니다.");
				break;
			}else {
				System.out.println("1 , 2 , 3 중 고르십시오.");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public User() {}
	

	public User(int id,String userId, String password, Date birth_date,String phone, String address,Timestamp joined_date) {
		super();
		this.id = 0;
		this.userId = userId;
		this.password = password;
		this.birth_date = birth_date;
		this.phone = phone;
		this.address = address;
		this.joined_date = joined_date;
	}

	public void selectWithUserId() {
		String sql = "select * from user where user_id=?";
		System.out.println("검색할 유저아이디를 작성해주세요.");
		String user_id = sc.nextLine();
		try(PreparedStatement pstm = MyConnect.getConnect().prepareStatement(sql)){
			pstm.setString(1, user_id);	//물음표에 user_id 값 대입.
			try(ResultSet rs = pstm.executeQuery()){
				rs.next();
				String str = "id : %d, user_id : %s, password : %s, birth_date : %s, phone : %s, address : %s, joined_date : %s";
				System.out.printf(str,rs.getInt("id"),rs.getString("user_id"),rs.getString("password"),rs.getString("birth_date"),rs.getString("phone"),rs.getString("address"),rs.getString("joined_date"));
				System.out.println();
			}
	
			Thread.sleep(1000);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void selectList1() {	//user객체를 생성하여 리스트에 넣는 메서드
		String sql = "select * from user";
		List<User> selectList1 = new ArrayList<User>();
		try(PreparedStatement pstm = MyConnect.getConnect().prepareStatement(sql);
				ResultSet rs = pstm.executeQuery()){
			while(rs.next()) {
				User user = new User(rs.getInt("id"),rs.getString("user_id"), rs.getString("password"), 
						rs.getDate("birth_date"), rs.getString("phone"), rs.getString("address"),rs.getTimestamp("joined_date"));
				selectList1.add(user);
			}
			for (int i =0; i<selectList1.size(); i++) {
				System.out.println(selectList1.get(i));
			}
			Thread.sleep(1000);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void selectList() {	// 리스트 객체에 user객체 없이 대입하여 만드는 메서드.
		List<String> selectList = new ArrayList<String>();
		String sql = "select * from user";
		try(PreparedStatement pstm = MyConnect.getConnect().prepareStatement(sql);
				ResultSet rs = pstm.executeQuery()){
			while(rs.next()) {

				selectList.add(rs.getString("id"));
				selectList.add(rs.getString("user_id"));
				selectList.add(rs.getString("password"));
				selectList.add(rs.getString("birth_date"));
				selectList.add(rs.getString("phone"));
				selectList.add(rs.getString("address"));
				selectList.add(rs.getString("joined_date"));
				System.out.printf(selectList.toString()+"\n");
				selectList.removeAll(selectList);
			}
			Thread.sleep(1000);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void update() {
		String sql = "update user set id=?";
		System.out.println("수정할 id번호를 입력해주세요");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("수정 할 user_id를 입력해주세요");
		System.out.println("수정 안할 시 Enter");
		String user_id = sc.nextLine();
		if(!user_id.equals("")) {
			sql+=",user_id=?";
		}
		System.out.println("수정 할 password를 입력해주세요");
		System.out.println("수정 안할 시 Enter");
		String password = sc.nextLine();
		if(!password.equals("")) {
			sql+=",password=?";
		}
		System.out.println("수정 할 birth_date를 입력해주세요");
		System.out.println("예시 : 2021-04-13");
		System.out.println("수정 안할 시 Enter");
		String birth_date = sc.nextLine();
		if(!birth_date.equals("")) {
			sql+=",birth_date=?";
		}
		System.out.println("수정 할 phone을 입력해주세요");
		System.out.println("수정 안할 시 Enter");
		String phone = sc.nextLine();
		if(!phone.equals("")) {
			sql+=",phone=?";
		}
		System.out.println("수정 할 address를 입력해주세요");
		System.out.println("수정 안할 시 Enter");
		String address = sc.nextLine();
		if(!address.equals("")) {
			sql+=",address=?";
		}
		System.out.println("수정 할 joined_date를 입력해주세요");
		System.out.println("예시 : 2021-04-13 17:00:00");
		System.out.println("수정 안할 시 Enter");
		String joined_date = sc.nextLine();
		if(!joined_date.equals("")) {
			sql+=",joined_date=?";
		}

		sql+=" where id=?";
		try(PreparedStatement pstm = MyConnect.getConnect().prepareStatement(sql)){
			int cnt =2;
			pstm.setInt(1, id);
			if(!user_id.equals("")) {
				pstm.setString(cnt++, user_id);
			}
			if(!password.equals("")) {
				pstm.setString(cnt++, password);
			}
			if(!birth_date.equals("")) {
				pstm.setString(cnt++,birth_date);
			}
			if(!phone.equals("")) {
				pstm.setString(cnt++, phone);
			}
			if(!address.equals("")) {
				pstm.setString(cnt++, address);
			}
			if(!joined_date.equals("")) {
				pstm.setString(cnt++, joined_date);
			}
			pstm.setInt(cnt, id);
			pstm.executeUpdate();
			System.out.println("업데이트 완료.");
			Thread.sleep(1000);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void insert() {
		String sql = "insert into user values(0,?,?,?,?,?,?)";
		try(Connection conn = MyConnect.getConnect();
				PreparedStatement pstm = conn.prepareStatement(sql)){
			System.out.println("생성할 유저아이디를 작성해주세요");
			String user_id = sc.nextLine();
			pstm.setString(1,user_id);

			System.out.println("생성할 비밀번호를 작성해주세요");
			String password = sc.nextLine();
			pstm.setString(2,password);

			System.out.println("생성할 birth_date를 작성해주세요");
			System.out.println("예시 : 2021-04-13");
			String birth_date = sc.nextLine();
			pstm.setString(3,birth_date);

			System.out.println("생성할 phone 번호를 입력해주세요");
			String phone = sc.nextLine();
			pstm.setString(4, phone);

			System.out.println("생성할 address를 입력해주세요");
			String address = sc.nextLine();
			pstm.setString(5, address);

			System.out.println("생성할 joined_date를 입력해주세요.");
			System.out.println("형식 : 2007-12-03T10:15:30");
			String joined_date = sc.nextLine();
			pstm.setTimestamp(6,Timestamp.valueOf(LocalDateTime.parse(joined_date)));

			int a=pstm.executeUpdate();
			System.out.println(a+"개의 row수행 완료.");
			Thread.sleep(1000);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void insertuser() {
		String sql = "insert into user values(0,"+userId+","+password+","+birth_date+","+phone+","+address+","+joined_date+")";

		try(PreparedStatement pstm = MyConnect.getConnect().prepareStatement(sql)){
			int Rows = pstm.executeUpdate();
			if(Rows >0) {
				System.out.println("유저 등록에 성공하였습니다.");
			}else {
				System.out.println("유저 등록에 실패하였습니다.");
			}
			Thread.sleep(1000);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void delete() {
		System.out.println("삭제하고자 하는 아이디번호를 입력해주세요.");
		String id = sc.nextLine();
		String sql = "delete from user where id=?";
		try (PreparedStatement pstm = MyConnect.getConnect().prepareStatement(sql)){
			pstm.setString(1, id);
			int Row = pstm.executeUpdate();
			if(Row >0) {
				System.out.println("삭제 작업 수행 완료.");
			}else {
				System.out.println("삭제 실패");
			}
			Thread.sleep(1000);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void HowManyUsers() {
		String sql = "select * from user";
		try(PreparedStatement pstm = MyConnect.getConnect().prepareStatement(sql);
				ResultSet rs = pstm.executeQuery()){
			int hmu =0;
			while(rs.next()) {
				rs.getInt(1);
				hmu+=1;
			}
			System.out.println(hmu+"명의 user가 있습니다.");
			Thread.sleep(1000);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void WhatColumn() {
		String sql = "select * from user";
		try(PreparedStatement pstm = MyConnect.getConnect().prepareStatement(sql))	{
			ResultSetMetaData rsmd = pstm.getMetaData();
			int columnCnt = rsmd.getColumnCount();
			System.out.print("[ ");
			for (int i = 1; i <= rsmd.getColumnCount(); i++) {
				if(i==columnCnt) {
					System.out.printf("%s",rsmd.getColumnName(i));
				}else {
					System.out.printf("%s, ",rsmd.getColumnName(i));
				}
			}
			System.out.print(" ]");
			System.out.printf("총 %d 개 입니다.",columnCnt);
			System.out.println();
			Thread.sleep(1000);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}







	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(String birth_date) {
		this.birth_date = birth_date;
	}


	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getJoined_date() {
		return joined_date;
	}

	public void setJoined_date(String joined_date) {
		this.joined_date = joined_date;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userId=" + userId + ", password=" + password + ", birth_date=" + birth_date
				+ ", address=" + address + ", joined_date=" + joined_date + "]";
	}
}
