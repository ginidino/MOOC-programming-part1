package WEEK4;

// Exercise 83: Game logic for Hangman
// Exercise 83.1: Guessing a letter
public class Exercise831 {
	public static void main(String[] args) {
		HangmanLogic l = new HangmanLogic("kissa");
		System.out.println("guessing: A, D, S, F, D");
		l.guessLetter("A");   // correct
		l.guessLetter("D");   // wrong
		l.guessLetter("S");   // correct
		l.guessLetter("F");   // wrong
		l.guessLetter("D");   // This should not have any effect on the number of faults since D was already guessed
		System.out.println("guessed letters: "+ l.guessedLetters());
		System.out.println("number of faults: "+ l.numberOfFaults());
	}
}
