package Test;

import java.util.Scanner;

// first version is if type a blank in the first, it breaks
public class Exercise55while {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		while (true) {
			System.out.print("Type the first word: ");
	        String word1 = reader.nextLine();
	        if (word1.isEmpty()) {
	        	break;
	        }
	        System.out.print("Type the second word: ");
	        String word2 = reader.nextLine();
	        if (word1.indexOf(word2) != -1) {
	        	System.out.println("The word '" + word2 + "' is found in the word '" + word1 + "'");
	        } else {
	        	System.out.println("The word '" + word2 + "' is not found in the word '" + word1 + "'");
	        }
		}
	}
}
