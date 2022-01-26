package WEEK3;

import java.util.Scanner;
import java.util.ArrayList;

// Recurring word
// asks the user to input words until the user gives the same word twice
// Use an ArrayList structure
// Hint : ArrayList has the method .contains()
public class Exercise58 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ArrayList<String> words = new ArrayList<String>();
		while(true) {
			System.out.print("Type a word: ");
			String word = reader.nextLine();
			
			if (words.contains(word)) {
				System.out.print("You gave the word " + word + " twice");
				break;
			}
			words.add(word);
		}
	}
}
