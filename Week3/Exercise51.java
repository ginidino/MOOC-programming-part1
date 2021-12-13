package test3;

import java.util.Scanner;

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
