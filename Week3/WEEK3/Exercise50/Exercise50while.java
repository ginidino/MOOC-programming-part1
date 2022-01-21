package Test;

import java.util.Scanner;

public class Exercise50while {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		while (true) {
			System.out.print("Type your name: ");
	        String name = reader.nextLine();
	        
	        if (name.isEmpty()) {
	        	break;
	        }
	        
	        if (name.length() < 3) {
	        	System.out.println("Please type a name with more than 3 letters.");
	        } else {
	        	for (int i = 0; i < 3; i++) {
	        		System.out.println((i + 1) + ". character: " + name.charAt(i));
	        	}
	        }
		}
	}
}
