package WEEK2;

import java.util.Scanner;

// Many prints
// ask the user how many times the text should be printed (meaning how many times the method is called)
public class Exercise38 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("How many? ");
		int num = Integer.parseInt(reader.nextLine());
		// for loop
		for (int i = num; i > 0; i--) {
			printText();
		}
		System.out.println();
		// while loop
		while (num > 0) {
			num--;
			printText();
		}
	}

	public static void printText() {
		System.out.println("In the beginning there were the swamp, the hoe and Java.");
	}
}
