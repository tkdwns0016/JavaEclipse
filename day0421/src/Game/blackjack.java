package Game;

import java.net.Socket;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Application.CLS;



public class blackjack {
	String id;
	String password;
	String rating;
	int money;
	Scanner sc = new Scanner(System.in);
	private int userDeck[]= { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }; //플레이할동안 카드를 받을 횟수를 10번으로 잡고 배열 선언
	Socket socket;
	List<Socket> user = new ArrayList<Socket>();
	CLS cls=new CLS();
	
	private static blackjack instance = new blackjack();

	public static blackjack getInstance() {
		return instance;
	}
	public blackjack(Socket socket) {
		this.socket = socket;
	}	
	public blackjack() {
	}		


	public blackjack(String id, String password,String rating, int money) {
		super();
		this.id = id;
		this.password = password;
		this.rating = rating;
		this.money = money;
	}

	public blackjack signup() {
		String selectid;
		String selectpw;
		blackjack user = new blackjack(socket);
		String sql ="insert into user values(?,?,\"브론즈\",100000)";
		int row=0;
		while(true) {
			try(PreparedStatement pstm = MyConnect.getConnect().prepareStatement(sql)){
				System.out.println("사용할 아이디를 정해주세요(최대 10글자)");
				selectid = sc.nextLine();
				if(selectid.length()>10) {
					System.out.println("10글자를 넘어섰습니다. 다시 입력해주세요");
				}else{
					String sql1 = "select id,count(id) as count from user where id=\""+selectid+"\"";
					try(PreparedStatement pstm1 = MyConnect.getConnect().prepareStatement(sql1);
							ResultSet rs = pstm1.executeQuery()){
						rs.next();
						int rsrow=rs.getInt("count");
						if(rsrow>0) {
							System.out.println("중복된 아이디가 있습니다.");
							continue;
						}else {
							pstm.setString(1, selectid);
							System.out.println("사용하실 비밀번호를 입력해주세요");
							selectpw = sc.nextLine();
							pstm.setString(2, selectpw);
							row = pstm.executeUpdate();
							if(row>0) {
								String selectall = "select * from user where id=\'"+selectid+"\' and password=\'"+selectpw+"\'";
								try(PreparedStatement pstm2 = MyConnect.getConnect().prepareStatement(selectall);
										ResultSet rs1 = pstm2.executeQuery()){
									rs1.next();
									user.setId(rs1.getString("id"));
									user.setPassword(rs1.getString("password"));
									user.setrating(rs1.getString("rating"));
									user.setMoney(rs1.getInt("money"));
									System.out.println("생성이 완료 되었습니다.");
									System.out.println(user);
									break;
								}
							}else {
								System.out.println("생성 실패, 다시 가입해주세요.");
							}
						}
					}
				}
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return user;
	}

	public void charge(blackjack user) {
		String sql="update user set money=? where id=? and password=?";
		
		try(PreparedStatement pstm = MyConnect.getConnect().prepareStatement(sql)){
			
			while(true) {
			
			
			System.out.println("아이디를 입력해주세요");
			id=sc.nextLine();
			
			System.out.println("비밀번호를 입력해주세요");
			password=sc.nextLine();
			
			
			int charge, chargeSum;
			System.out.println("충전 금액을 입력해주세요");
			charge=sc.nextInt();
			chargeSum=charge+user.getMoney();
			
			
			pstm.setInt(1, chargeSum);
			pstm.setString(2, id);
			pstm.setString(3, password);
			
			pstm.executeUpdate();
			
		    if(pstm.executeUpdate()>0) {
            	System.out.println(charge+"가 충전 되었습니다.");
            	System.out.println(">>> 아이디 : "+id+", 소지금 : "+chargeSum);
            	break;


            }else {
            	cls.run();
            	System.out.println(">>> 아이디 비밀번호가 잘못 입력 하셨습니다.");
            	break;
            }
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void present(blackjack user) {
		String sql="select * from user where id=? and password=?";
		String sql1="select id,money from user where id=?";
		String sql2="update user set money=? where id=?";
		String sql3="update user set money=? where id=?";
		 try(PreparedStatement pstm = MyConnect.getConnect().prepareStatement(sql)){
			    while(true) {
		            System.out.println("아이디를 입력해주세요");
		            id = sc.nextLine();
		            pstm.setString(1, id);
		   
		            System.out.println("패스워드를 입력해주세요");
		            password = sc.nextLine();
		            pstm.setString(2, password);
		            try(ResultSet rs = pstm.executeQuery()){
		            	rs.next();
		            	System.out.println(rs.getString("id")+"님의 현재 잔액은 : "+rs.getInt("money")+" 원 입니다.");
		            	System.out.println("얼마를 선물하시겠습니까?");
		            	int present = sc.nextInt();
		            	try(PreparedStatement pstm1=MyConnect.getConnect().prepareStatement(sql1)){
		            	System.out.println("선물한 분의 아이디를 입력해주세요");
		            	String GiveId=sc.nextLine();
		            	pstm1.setString(1, GiveId);
		            		try(ResultSet rs1=pstm1.executeQuery()){
		            			rs1.next();
		            			int totalGive = present + rs.getInt("money");
		            			try(PreparedStatement pstm2 = MyConnect.getConnect().prepareStatement(sql2)){
		            				pstm2.setInt(1, totalGive);
		            				pstm2.setString(2, GiveId);
		            				pstm2.executeUpdate();
		            				
		            				
		            			
		            			}
		            		}
		            	
		             }
		            }
			    }
		 } catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		            
	}
	public void delete(blackjack user) {
	      String sql="delete from user where id=? and password=?";
	      try(PreparedStatement pstm = MyConnect.getConnect().prepareStatement(sql)){
	         
	         while(true) {
	            System.out.println("삭제할 아이디를 입력해주세요");
	            id = sc.nextLine();
	            pstm.setString(1, id);
	   
	            System.out.println("패스워드를 입력해주세요");
	            password = sc.nextLine();
	            pstm.setString(2, password);
	            
	           
	            if(pstm.executeUpdate()>0) {
	            	System.out.println(">>> 아이디 : "+id+" 가 삭제되었습니다.");
	            	break;
//	            try(){
//	               rs.next();
//	               user.setId(rs.getString("id"));
//	               System.out.println(">>> 아이디 : "+user.getId()+"가 삭제되었습니다.");
//	               break;

	            }else {
	            	cls.run();
	            	System.out.println(">>> 잘못 입력 하셨습니다.");
	            	break;
	            }
	         }
	      } catch (SQLException e) {

	      } catch (ClassNotFoundException e) {
	         e.printStackTrace();
	      }
	   }
	   
	

	public void login(blackjack user) {
		String id1,password1;
		String sql = "select * from user where id=? and password=?";
		try(PreparedStatement pstm = MyConnect.getConnect().prepareStatement(sql)){
			System.out.println("Log In");
				System.out.println("아이디를 입력해주세요");
				id1 = sc.nextLine();
				if(id1.equals("")) {
					System.out.println("공백을 입력하셨습니다");
				}else {
					pstm.setString(1, id1);
				}
				System.out.println("패스워드를 입력해주세요");
				password1 = sc.nextLine();
				pstm.setString(2, password1);
				try(ResultSet rs = pstm.executeQuery()){
					rs.next();
					if(!rs.getString("id").equals(null)) {
					System.out.println("로그인 성공했습니다.");
					user.setId(rs.getString("id"));
					user.setPassword(rs.getString("password"));
					user.setrating(rs.getString("rating"));
					user.setMoney(rs.getInt("money"));
					
					System.out.println("┌─────────────────────────────────────────────┐");
					System.out.println("│ "+"ID :"+user.getId()+ ", 랭킹 :" +user.getrating()+", 소지금 :"+ user.getMoney() +"           │");
					System.out.println("└─────────────────────────────────────────────┘");
					}
				
					
					
					
				}catch(SQLException e1){
					cls.run();
					System.out.println("없는 아이디 입니다. 다시 확인 부탁드립니다.");
				}
		} catch (SQLException e) {

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}


	public void check(blackjack user) {
		String findid,findpw;
		String sql = "select * from user where id=? and password=?";
		try(PreparedStatement pstm = MyConnect.getConnect().prepareStatement(sql)){
			System.out.println("조회하실 아이디를 입력해주세요");
			findid = sc.nextLine();
			pstm.setString(1, findid);
			System.out.println("조회하실 비밀번호를 입력해주세요");
			findpw = sc.nextLine();
			pstm.setString(2, findpw);
			try(ResultSet rs = pstm.executeQuery()){
				rs.next();
				System.out.println("ID : "+rs.getString("id")+",  rating : "+rs.getString("rating")+",  Money : "+rs.getInt("money"));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			cls.run();
			System.out.println("없는 아이디 입니다. 다시 확인 부탁드립니다.");
		}
	}

	public int[] getUserDeck() {
		return userDeck;
	}

	public Socket getSocket() {
		return socket;
	}
	public void setUserDeck(int[] userDeck) {
		this.userDeck = userDeck;
	}
	public void resetUserDeck() {
		int reuserDeck[]= { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
		this.userDeck = reuserDeck;
		
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getrating() {
		return rating;
	}

	public void setrating(String rating) {
		this.rating = rating;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}

	public static void setInstance(blackjack instance) {
		blackjack.instance = instance;
	}

	@Override
	public String toString() {
		String result="";
		if(result.equals(""))
		System.out.println(">>> 블랙잭[쇼미더머니]에 가입하신걸 환영합니다.");
		System.out.println(">>> 첫 가입 보너스로 기본금 $100,000이 지급됩니다.");
		System.out.println("┌─────────────────────────────────────────────┐");
		System.out.println("│ "+"ID :"+id+ ", 랭킹 :" +rating+", 소지금 :"+ money +"           │");
		System.out.println("└─────────────────────────────────────────────┘");
		
		return result;
	}



}
			