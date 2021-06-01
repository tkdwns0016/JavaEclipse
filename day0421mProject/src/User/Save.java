package User;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import Game.MyConnect;
import Game.blackjack;


public class Save implements Runnable{
	blackjack user;
	public Save(blackjack user) {
		this.user = user;
	}
	public void run() {
		while(true) {
			String sql = "update user set money=? where id=? and password=?";
			try(PreparedStatement pstm = MyConnect.getConnect().prepareStatement(sql)){
				//pstm.setString(1, user.getrating());
				pstm.setInt(1, user.getMoney());
				pstm.setString(2, user.getId());
				pstm.setString(3, user.getPassword());
				pstm.executeUpdate();
				Thread.sleep(500);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


