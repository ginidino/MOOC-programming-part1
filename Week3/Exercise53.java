package test3;

import java.util.Scanner;

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
