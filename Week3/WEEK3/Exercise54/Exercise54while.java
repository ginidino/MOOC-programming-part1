package Test;

import java.util.Scanner;

public class Exercise54while {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		while(true) {
			System.out.print("Type a word: ");
	        String word = reader.nextLine();
	        if (word.equals("")) {
	        	break;
	        }
	        System.out.print("Length of the end part: ");
	        int lengthOfEnd = Integer.parseInt(reader.nextLine());
	        System.out.print("Result: " + word.substring(word.length()-lengthOfEnd, word.length()));
	        System.out.println();
		}
	}
}
