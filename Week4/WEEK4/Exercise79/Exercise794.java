package WEEK4;

import java.util.Scanner;

// Exercise 79.4: Many sums
public class Exercise794 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		NumberStatistics sum = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();
		
		System.out.println("Type numbers: ");
		
		while(true) {
			int num = Integer.parseInt(reader.nextLine());
			if (num == -1) {
				break;
			}
			sum.addNumber(num);
			
			if (num % 2 == 0) {
				even.addNumber(num);
			} else {
				odd.addNumber(num);
			}
		}
		System.out.println("sum: " + sum.sum());
		System.out.println("sum of even: " + even.sum());
        System.out.println("sum of odd: " + odd.sum());
	}
}
