package WEEK3;

import java.util.Scanner;

// A word inside a word
// asks the user for two words
// if the second word is included in the first word
// Use String method indexOf
public class Exercise55 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Type the first word: ");
        String word1 = reader.nextLine();
        System.out.print("Type the second word: ");
        String word2 = reader.nextLine();
        if (word1.indexOf(word2) != -1) {
        	System.out.println("The word '" + word2 + "' is found in the word '" + word1 + "'");
        } else {
        	System.out.println("The word '" + word2 + "' is not found in the word '" + word1 + "'");
        }
	}
}
