package WEEK3;

import java.util.Scanner;

// The end part
// prints the end part of a word
// asks the user for the word and the length of the end part
// Use the substring method
public class Exercise54 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
        System.out.print("Type a word: ");
        String word = reader.nextLine();
        System.out.print("Length of the end part: ");
        int lengthOfEnd = Integer.parseInt(reader.nextLine());
        System.out.print("Result: " + word.substring(word.length()-lengthOfEnd, word.length()));
	}
}
