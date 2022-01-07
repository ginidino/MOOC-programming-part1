package WEEK1;

import java.util.Scanner;

//Adder
public class Exercise08 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Type a number: ");
		int num1 = Integer.parseInt(reader.nextLine());
		System.out.print("Type another number: ");
		int num2 = Integer.parseInt(reader.nextLine());
		int sum = num1 + num2;
		System.out.println();
		System.out.println("Sum of the numbers: " + (num1 + num2));
		System.out.println("Sum of the numbers: " + sum);
	}
}
