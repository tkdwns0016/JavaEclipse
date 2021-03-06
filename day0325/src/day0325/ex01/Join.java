package day0325.ex01;

import java.util.HashMap;
import java.util.Map;

public class Join {
	private Map<String,String> users;
	
	// users 맵 초기화( 객체 생성 후 변수[Map]에 대입 )
	public Join() {
		users = new HashMap<String, String>(); 
	}
	
	//id 와 password를 받아서 맵[users]에 저장.
	public int join(String id, String password) throws DuplicationIdException {
		//id의 중복이 발생하면 예외를 던진다.
		if(users.containsKey(id)) {
			throw new DuplicationIdException();
		}
		users.put(id,password);
		
		return users.size();
	}
	
	// 맵 [users]를 반환함.
	public Map<String , String> getUsers(){
		return users;
	}
	
	
	
	
	
	
	
	
	
	
	
}