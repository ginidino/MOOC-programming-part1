package WEEK3;

import java.util.*;

// Words in reverse order
//  asks the user to input words, until the user gives an empty string
// prints the words the user gave in reversed order, the last word is printed first etc.
public class Exercise59 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ArrayList<String> words = new ArrayList<String>();
		while (true) {
			System.out.print("Type a word: ");
			String word = reader.nextLine();
			
			if (word.isEmpty()) {
				break;
			}
			words.add(word);
		}
		Collections.reverse(words);
		System.out.println("You typed the following words:");
		
		for (String word : words) {
			System.out.println(word);
		}
	}
}
