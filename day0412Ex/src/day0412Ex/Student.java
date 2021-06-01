package day0412Ex;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class Student {
	private int id;
	private String name;
	private LocalDate birth_date;
	private int kor;
	private int eng; 
	private int math;
	
	public Student() {};
	
	public Student(int id,String name,LocalDate birth_date,int kor, int eng, int math) {
		this.id = id;
		this.name = name;
		this.birth_date = birth_date;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	};
	
	public void insert(String name,LocalDate birth_date,int kor, int eng,int math) {
		try{
			String sql = "insert student values(0,'"+name+"','"+birth_date+"',"+kor+","+eng+","+math+");";
			int affectedRows =0;
			affectedRows = MyStatement.getStatement().executeUpdate(sql);
			
			if(affectedRows > 0 ) {
				System.out.println(affectedRows+"개의 Rows 입력 완료.");
			}else {
				System.out.println("자료 입력 실패.");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void select(String name) throws ClassNotFoundException, SQLException {
		Student a = new Student();
		if (name.equals("all")) {
		String sql = "select * from student;";
//		long affectedRows =0;
//		affectedRows = MyStatement.getStatement().executeLargeUpdate(sql);
//		if(affectedRows > 0 ) {
			ResultSet rs = MyStatement.getStatement().executeQuery(sql);
			rs.next();
			a.setId(rs.getInt("id"));
			a.setName(rs.getString("name"));
			a.setBirth_date(rs.getDate("birth_date").toLocalDate());
			a.setKor(rs.getInt("kor"));
			a.setEng(rs.getInt("eng"));
			a.setMath(rs.getInt("math"));
			System.out.println(a);
//			System.out.println(affectedRows+"개의 Rows 조회 완료.");
//		}else {
//			System.out.println("자료 입력 실패.");
//		}
		}else {
			String sql = "select * from student where name ='"+name+"';";
//			long affectedRows =0;
//			affectedRows = MyStatement.getStatement().execute(sql);
//			if(affectedRows > 0 ) {
				ResultSet rs = MyStatement.getStatement().executeQuery(sql);
				rs.next();
				a.setId(rs.getInt("id"));
				a.setName(rs.getString("name"));
				a.setBirth_date(rs.getDate("birth_date").toLocalDate());
				a.setKor(rs.getInt("kor"));
				a.setEng(rs.getInt("eng"));
				a.setMath(rs.getInt("math"));
				System.out.println(a);
//				System.out.println(affectedRows+"개의 Rows 조회 완료.");
//			}else {
//				System.out.println("자료 조회 실패.");
//			}
		}
	}
	
	public void update(String name,LocalDate birth_date,int kor,int eng,int math,int id) throws ClassNotFoundException, SQLException {
		String sql = "update student set name='"+name+"',birth_date='"+birth_date+"',kor="+kor+",eng="+eng+",math="+math+" where id="+id+";";
		int affectedRows =0;
		affectedRows = MyStatement.getStatement().executeUpdate(sql);
		if(affectedRows > 0 ) {
			System.out.println(affectedRows+"개의 Rows 수정 완료.");
		}else {
			System.out.println("자료 수정 실패.");
		}
	}
	
	public void delete(int id) throws ClassNotFoundException, SQLException {
		String sql = "delete from student where id="+id+";";
		int affectedRows =0;
		affectedRows = MyStatement.getStatement().executeUpdate(sql);
		if(affectedRows > 0 ) {
			System.out.println(affectedRows+"개의 Rows 삭제 완료.");
		}else {
			System.out.println("자료 삭제 실패.");
		}
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getBirth_date() {
		return birth_date;
	}
	public void setBirth_date(LocalDate birth_date) {
		this.birth_date = birth_date;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}

	@Override
	public String toString() {
		return "학생 name=" + name +", ID=" + id +", 생년월일=" + birth_date + ", kor=" + kor + "점, eng=" + eng
				+ "점, math=" + math + "점 입니다.";
	}
	
}
