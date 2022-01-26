package WEEK3;

import java.util.Scanner;
import java.util.ArrayList;

// Words
// asks the user to input words until the user types in an empty String
// prints the words the user gave
// Try the for repetition sentence here
// Use an ArrayList structure
public class Exercise57 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ArrayList<String> words = new ArrayList<String>();
		while(true) {
			System.out.print("Type a word: ");
			String word = reader.nextLine();
			
			if (word.isEmpty()) {
				break;
			}
			words.add(word);
		}
		System.out.println("You typed the following words: ");
		for (String word : words) {
			System.out.println(word);
		}
	}
}
