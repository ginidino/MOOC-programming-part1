package Test;

import java.util.Scanner;

public class Exercise52while {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		while(true) {
			System.out.print("Type your name: ");
	        String name = reader.nextLine();
	        if (name.isEmpty()) {
	        	break;
	        }
	        System.out.print("In reverse order: ");
	        for (int i = name.length()-1; i >= 0; i--) {
	        	System.out.print(name.charAt(i));
	        }
	        System.out.println();
		}
	}
}
