package test3;

import java.util.Scanner;
import java.util.ArrayList;

public class Exercise58 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ArrayList<String> words = new ArrayList<String>();
		while (true) {
			System.out.print("Type a word: ");
			String word = reader.nextLine();
			if(words.contains(word)) {
				System.out.print("You gave twice the word  " + word);
				break;
			}
			words.add(word);
		}
	}
}
