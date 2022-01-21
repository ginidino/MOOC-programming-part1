package WEEK3;

import java.util.Scanner;

// The length of a name
// asks for the user's name and says how many characters the name contains.
public class Exercise47 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Type your name: ");
		String name = reader.nextLine();
		System.out.print("Number of characters: " + calculateCharacters(name));
	}
	public static int calculateCharacters(String text) {
		return text.length();
	}
}
