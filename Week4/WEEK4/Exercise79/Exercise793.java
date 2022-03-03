package WEEK4;

import java.util.Scanner;

// Exercise 79.3: Asking for numbers from the user
public class Exercise793 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		NumberStatistics stats = new NumberStatistics();
		
		System.out.println("Type numbers: ");
		
		while(true) {
			int num = Integer.parseInt(reader.nextLine());
			if (num == -1) {
				break;
			}
			stats.addNumber(num);
		}
		System.out.println("sum: " + stats.sum());
	}
}
