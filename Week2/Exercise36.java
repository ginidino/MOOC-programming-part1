package test2;

import java.util.Scanner;

public class Exercise36 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int sum = 0;
		int numbers = 0;
		int even = 0;
		
		System.out.println("Type numbers:  ");
		while (true) {
			int num = Integer.parseInt(reader.nextLine());
			if (num == -1) {
				break;
			}
			sum += num;
			numbers++;
			
			if (num % 2 == 0) {
				even++;
			}
		}
		double average = (double) sum / numbers;
		int odd = numbers - even;
		System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + numbers);
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);

	}
}
