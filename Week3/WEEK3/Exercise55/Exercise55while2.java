package Test;

import java.util.Scanner;

// second version is if the second word is not included in the first word, it breaks
public class Exercise55while2 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		while(true) {
			System.out.print("Type the first word: ");
	        String word1 = reader.nextLine();
	        System.out.print("Type the second word: ");
	        String word2 = reader.nextLine();
	        if (word1.indexOf(word2) != -1) {
	        	System.out.println("The word '" + word2 + "' is found in the word '" + word1 + "'");
	        } else {
	        	System.out.println("The word '" + word2 + "' is not found in the word '" + word1 + "'");
	        	break;
	        }
		}
	}
}
