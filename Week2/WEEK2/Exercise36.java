package WEEK2;

import java.util.Scanner;

// Loops, ending and remembering
// 36.1: Reading numbers
//  - asks the user to input numbers (integers)
//  - "Type numbers” until the user types the number -1
//  - When the user types the number -1, the program prints "Thank you and see you later!" and ends.
// 36.2: The sum of the numbers (without the number -1).
// 36.3: Summing and counting the numbers (without the number -1).
// 36.4: Counting the average (without the number -1).
// 36.5: Even and odd numbers
//  - print the number of even and odd numbers (without the number -1).
public class Exercise36 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		double average = 0;
		int even = 0;
		int odd = 0;
		System.out.println("Type numbers:  ");
		// 36.1
		while (true) {
			int num = Integer.parseInt(reader.nextLine());
			if (num == -1) {
				System.out.println("Thank you and see you later!");
				break;
			}
			// 36.2
			sum += num;
			// 36.3
			count++;
			// 36.4
			average = (double) sum / count;
			// 36.5
			if (num % 2 == 0) {
				even ++;
			} else {
				odd++;
			}
		}
		// odd = count - even;
		System.out.println("The sum is " + sum);
		System.out.println("How many numbers: " + count);
		System.out.println("Average: " + average);
		System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
	}
}
