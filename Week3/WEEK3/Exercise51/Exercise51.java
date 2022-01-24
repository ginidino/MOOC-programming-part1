package WEEK3;

import java.util.Scanner;

// Separating characters
// asks for the user's name and gives its characters separately
public class Exercise51 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Type your name: ");
        String name = reader.nextLine();
        for (int i = 0; i < name.length(); i++) {
        	System.out.println((i + 1) + ". character: " + name.charAt(i));
        }
	}
}
