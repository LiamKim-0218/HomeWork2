package AdventureRPG;

public class Main {
	
	public static void main(String[] args) {
		
		CharacterMade made = new CharacterMade();
		Start start = new Start();
		
		made.Made();
		start.Start();
		
		Fight.startBattle();
		Fight.getPlayerChoice();
//		Fight.getPlayerChoice();
		
	}
}