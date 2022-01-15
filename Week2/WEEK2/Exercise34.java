package WEEK2;

import java.util.Scanner;

// Factorial
// calculates the factorial of the number n
// formula 1*2*3*...*n ex) 4! = 1*2*3*4 = 24 and 0! = 1
public class Exercise34 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Type a number:  ");
		int n = Integer.parseInt(reader.nextLine());
		int factorial = 1;
		// while loop
		int num = 1;
		while (num <= n) {
			factorial *= num;
			num++;
		}
		System.out.println("The result is " + factorial);
		System.out.println();
		// for loop
		int factori = 1;
		for (int i = 1; i <= n; i++) {
			factori *= i;
		}
		System.out.println("The result is " + factori);
	}
}
