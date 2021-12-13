package test2;

import java.util.Scanner;

public class Exercise38 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("How many?");
		int i = Integer.parseInt(reader.nextLine());
		while (i > 0) {
			i--;
			printText();
		}
	}
	public static void printText() {
		System.out.println("In the beginning there were the swamp, the hoe and Java.");
	}
}
