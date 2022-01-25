package WEEK3;

import java.util.Scanner;

// Reversing text
// Create the method reverse that puts the given string in reversed order
/* Hint: you probably need to build the reversed string character by character in your method
         use a String-type variable as a helper during the building process
         In the beginning, the helper variable should have an empty string of characters as a value
         After this, new characters are added to the string one by one.*/
public class Exercise56 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Type in your text: ");
	    String text = reader.nextLine();
	    System.out.println("In reverse order: " + reverse(text));
	}

	public static String reverse(String text) {
		String result = "";
		for (int i = text.length()-1; i >= 0; i--) {
			result += text.charAt(i);
		}
		return result;
	}
}
