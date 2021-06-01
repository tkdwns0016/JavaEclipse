package homework.user;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao{	//Data Access Object 
	//싱글톤 패턴 (디자인 패턴)
	//객체를 만드는 방법중 한가지.
	//객체를 딱 한번만 만들도록 하는 방식
	//UserDao 객체를 안에서 만든다.
	private static UserDaoImpl instance = new UserDaoImpl();
	
	//외부에서 객체 생성을 못하도록 막는다.
	private UserDaoImpl() {};
	
	//객체 instance를 받아볼 수 있는 메서드를 제공한다.
	public static UserDaoImpl getInstance() {
		return instance;
	}

	@Override
	public User selectWithUserId(User user) {
		String sql ="select * from user where user_id=?";
		User resultUser =null;
		try(PreparedStatement pstm = MyConnect.getConnect().prepareStatement(sql)){
			pstm.setString(1, user.getUserId());
			try(ResultSet rs = pstm.executeQuery()){
			if(rs.next()) {//rs.next()가 참이면 실행.
				resultUser =new User();
				resultUser.setId(rs.getInt("id"));
				resultUser.setUserId(rs.getString("user_id"));
				resultUser.setPassword(rs.getString("password"));
				resultUser.setBirthDate(LocalDate.parse(rs.getString("birth_date")));
//				resultUser.setBirthDate(rs.getDate("birth_date").toLocalDate());	//rs의 getdate를 사용해 birth_date값을 불러오고 그 값을 toLocalDate로 LocalDate타입으로 변경해줌.
				resultUser.setPhone(rs.getString("phone"));
				resultUser.setAddress(rs.getString("address"));
				resultUser.setJoinedDate(LocalDateTime.parse(rs.getString("joined_date"),DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));	//DateTimeFormatter를 사용해 패턴을 지정해주면 문자열로 날짜시간을 받더라도 패턴에 맞게 반환해줌.
//				resultUser.setJoinedDate(LocalDateTime.parse(rs.getString("joined_date")));	//이렇게 하면 오류가 날 가능성이 크다. 그러므로 위에 Formatter를 사용하는게 안전하다.
//				resultUser.setJoinedDate(rs.getTimestamp("joined_date").toLocalDateTime());
				return resultUser;
			}
//			User user1 = new User(rs.getInt("id"), rs.getString("user_id"), rs.getString("password"), LocalDate.parse(rs.getString("birth_date")), rs.getString("phone"), rs.getString("address"), LocalDateTime.parse(rs.getString("joined_date")));
//			return user1;
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultUser;
	}

	@Override
	public List<User> selectList() {
		List<User> userList = null;
		String sql = "select * from user";
		try(PreparedStatement pstm = MyConnect.getConnect().prepareStatement(sql);
				ResultSet rs = pstm.executeQuery()){
			userList = new ArrayList<User>();
			while(rs.next()) {
				User user = new User(rs.getInt("id"), rs.getString("user_id"),rs.getString("password"), rs.getDate("birth_date").toLocalDate(),rs.getString("phone"),rs.getString("address"),rs.getTimestamp("joined_date").toLocalDateTime());
				userList.add(user);
				return userList;
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userList;
	}

	@Override
	public int insert(User user) {
		int result = 0;
		String sql = "insert into user values(?,?,?,?,?,?,?)";
		try(PreparedStatement pstm = MyConnect.getConnect().prepareStatement(sql)){
			pstm.setInt(1, user.getId());
			pstm.setString(2, user.getUserId());
			pstm.setString(3, user.getPassword());
//			pstm.setString(4, user.getBirthDate().toString());
			pstm.setDate(4,Date.valueOf(user.getBirthDate()));
			pstm.setString(5, user.getPhone());
			pstm.setString(6, user.getAddress());
//			pstm.setString(7,user.getJoinedDate().toString());
			pstm.setTimestamp(7, Timestamp.valueOf(user.getJoinedDate()));
			
			result=pstm.executeUpdate();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int update(User user) {
		int result = 0;
		String sql = "update user set user_id=?,password=?,birth_date=?,phone=?,address=?,joined_date=? where id=?";
		
		try(PreparedStatement pstm = MyConnect.getConnect().prepareStatement(sql)){
			pstm.setString(1,user.getUserId());
			pstm.setString(2,user.getPassword());
			pstm.setString(3, user.getBirthDate().toString());
			pstm.setString(4, user.getPhone());
			pstm.setString(5, user.getAddress());
			pstm.setString(6, user.getJoinedDate().toString());
			pstm.setInt(7, user.getId());
			
			result = pstm.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return result;
	}

	@Override
	public int delete(User user) {
		int result = 0;
		String sql = "delete from user where id=?";
		try(PreparedStatement pstm = MyConnect.getConnect().prepareStatement(sql)){
			pstm.setInt(1, user.getId());
			result=pstm.executeUpdate();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
}
