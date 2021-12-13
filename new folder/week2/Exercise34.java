package test2;

import java.util.Scanner;

public class Exercise34 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Type a number:  ");
		int i = Integer.parseInt(reader.nextLine());
		int factorial = 1;
		
		int num = 1;
		while (num <= i) {
			factorial *= num;
			num++;
		}
		System.out.println("The result is " + factorial);
	}
}
