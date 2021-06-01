package day0317.robot02;

public class RobotTest {
	public static void main(String[] args) {
		
//		Robot t = new TaekwonV();
//		t.fight();
//		
//		Robot tr = new Transformer();
//		tr.fight();
//		
//		Robot g = new Gundam();
//		g.fight();
				
		Game game = new Game(new Transformer());
		game.playGame();
		
		
		
		
		
		
	}
}
