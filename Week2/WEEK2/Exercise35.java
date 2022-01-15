package WEEK2;

import java.util.Scanner;

// Sum of the powers
// calculates the sum of 20+21+22+...+2n, where n is a number entered by the user
// The notation 2i means raising the number 2 to the power of i, for example 24 = 2*2*2*2 = 16
// we can calculate the power with the command Math.pow(number, power)
// returns a number of double type (i.e. floating point number)
// A double can be converted into the int type (i.e. whole number) as follows: int result = (int)Math.pow(2, 3).
public class Exercise35 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Type a number:  ");
		int n = Integer.parseInt(reader.nextLine());
		// while loop
		int result = 0;
		int num = 0;
		while (num <= n) {
			int power = (int) Math.pow(2, num);
			result += power;
			num++;
		}
		System.out.println("The result is " + result);
		System.out.println();
		// for loop
		int total = 0;
		for (int i = 0; i <= n; i++) {
			int pow = (int)Math.pow(2, i);
			total += pow;
		}
		System.out.println("The result is " + total);
	}
}
