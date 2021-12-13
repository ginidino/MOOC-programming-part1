package test3;

import java.util.Scanner;

public class Exercise48 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
        System.out.print("Type your name ");
        String name = reader.nextLine();
        System.out.println("First character: " + firstCharacter(name));

	}
	 public static char firstCharacter(String text) {
		 return text.charAt(0);
	}
}
