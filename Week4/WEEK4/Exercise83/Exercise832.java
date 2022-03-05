package WEEK4;

// Exercise 83: Game logic for Hangman
//Exercise 83.2: Creating the hidden word
public class Exercise832 {
	public static void main(String[] args) {
		HangmanLogic l = new HangmanLogic("kissa");
		System.out.println("word is: "+ l.hiddenWord());

		System.out.println("guessing: A, D, S, F, D");
		l.guessLetter("A");
		l.guessLetter("D");
		l.guessLetter("S");
		l.guessLetter("F");
		l.guessLetter("D");
		System.out.println("guessed letters: "+ l.guessedLetters());
		System.out.println("number of faults: "+ l.numberOfFaults());
		System.out.println("word now: "+ l.hiddenWord());
	}
}
