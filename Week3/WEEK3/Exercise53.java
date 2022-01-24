package WEEK3;

import java.util.Scanner;

// First part
// prints the first part of a word
// asks the user for the word and the length of the first part.
// Use the substring method in your program
public class Exercise53 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Type a word: ");
        String word = reader.nextLine();
        System.out.print("Length of the first part: ");
        int lengthOfBeginning = Integer.parseInt(reader.nextLine());
        System.out.print("Result: " + word.substring(0, lengthOfBeginning));
	}
}
