package class1;

public class Methods {
	
	public static void main(String[] args) {
		boolean isGameOver = true;
		calculateScore();
		
	}
	
	public static void calculateScore() {
		
		int startingBonus = 100;
		int newGameScore = 32932;
		int total = startingBonus+newGameScore;
		System.out.println(total + " is the score");
		
	}

}
