package Test;

import java.util.Scanner;

public class Exercise53while {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		while(true) {
			System.out.print("Type a word: ");
	        String word = reader.nextLine();
	        
	        if (word.isEmpty()) {
	        	break;
	        }
	        System.out.print("Length of the first part: ");
	        int lengthOfBeginning = Integer.parseInt(reader.nextLine());
	        System.out.print("Result: " + word.substring(0, lengthOfBeginning));
	        System.out.println();
		}
	}
}
