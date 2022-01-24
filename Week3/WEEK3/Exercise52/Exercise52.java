package WEEK3;

import java.util.Scanner;

// Reversing a name
// asks for the user's name and prints it in reverse order
public class Exercise52 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Type your name: ");
        String name = reader.nextLine();
        System.out.print("In reverse order: ");
        for (int i = name.length()-1; i >= 0; i--) {
        	System.out.print(name.charAt(i));
        }
	}
}
