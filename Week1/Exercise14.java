package WEEK1;

import java.util.Scanner;

// positive number (greater than 0)
// using while loop
public class Exercise14 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		while (true) {
			System.out.print("Type a number: ");
			int num = Integer.parseInt(reader.nextLine());
			if (num == 0) {
				break;
			}
			if (num > 0) {
				System.out.println("The number is positive.");
			} else {
				System.out.println("The number is not positive.");
			}
		}
	}
}
