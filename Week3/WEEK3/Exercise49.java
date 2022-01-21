package WEEK3;

import java.util.Scanner;

// Last character
// asks for the user's name and gives the last character.
public class Exercise49 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        System.out.println("Last character: " + lastCharacter(name));
	}
	public static char lastCharacter(String text) {
		return text.charAt(text.length()-1);
	}
}
