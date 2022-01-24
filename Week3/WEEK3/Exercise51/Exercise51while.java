package Test;

import java.util.Scanner;

public class Exercise51while {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		while (true) {
			System.out.print("Type your name: ");
	        String name = reader.nextLine();
	        if (name.equals("")) {
	        	break;
	        }
	        for (int i = 0; i < name.length(); i++) {
	        	System.out.println((i + 1) + ". character: " + name.charAt(i));
	        }
		}
	}
}
