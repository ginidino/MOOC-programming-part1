package WEEK2;

import java.util.Scanner;

// The sum of a set of numbers
// 1+2+3+…+n where n is a number entered by the user
public class Exercise32 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Until what? ");
		int limit = Integer.parseInt(reader.nextLine());
		// while loop
		int sum = 0;
		int num = 1;
		while (num <= limit) {
			sum += num;
			num++;
		}
		System.out.println("Sum is " + sum);
		System.out.println();
		// for loop
        int result = 0;
        for (int i = 1; i <= limit; i++) {
        	result += i;
        }
        System.out.println("Sum is " + result);
	}
}
