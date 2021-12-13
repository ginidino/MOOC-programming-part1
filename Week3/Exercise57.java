package test3;

import java.util.Scanner;
import java.util.ArrayList;

public class Exercise57 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ArrayList<String> words = new ArrayList<String>();
		while (true) {
			System.out.print("Type a word: ");
			String word = reader.nextLine();
			if (word.equals("")) {
				break;
			}
			words.add(word);
		}
		System.out.println("You typed the following words: ");
		for (String word : words) {
			System.out.println(word);
		}
	}
}
