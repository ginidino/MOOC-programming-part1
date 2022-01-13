package WEEK2;

import java.util.Scanner;

// Up to a certain number
// all whole numbers from 1 to the number the user enters.
public class Exercise30 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Up to what number? ");
		int lastNum = Integer.parseInt(reader.nextLine());
		//while loop
		int num = 1;
		while (num <= lastNum) {
			System.out.println(num);
			num++;
		}
		System.out.println();
		// for loop
		for (int i = 1; i <= lastNum; i++) {
			System.out.println(i);
		}
	}
}
