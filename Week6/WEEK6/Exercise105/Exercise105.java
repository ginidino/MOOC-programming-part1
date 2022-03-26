package WEEK6;

// Exercise 105: Guessing game
public class Exercise105 {
	public static void main(String[] args) {
		GuessingGame game = new GuessingGame();
		
		// Exercise 105.1: Is greater than
		System.out.println(game.isGreaterThan(32));
		System.out.println();
		
		// Exercise 105.2: Average
		System.out.println(game.average(3, 4));
		System.out.println(game.average(6, 12));
		System.out.println();
		
		// we play two rounds
		game.play(1,10);  // value to be guessed now within range 1-10
		System.out.println();
		game.play(10,99);  // value to be guessed now within range 10-99
	}
}
