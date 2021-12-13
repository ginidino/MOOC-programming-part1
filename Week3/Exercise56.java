package test3;

import java.util.Scanner;

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
