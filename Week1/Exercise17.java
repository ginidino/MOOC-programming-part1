package WEEK1;

import java.util.Scanner;

//two numbers and prints the greater of those two
//handle the case in which the two numbers are equal
public class Exercise17 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Type the first number: ");
		int num1 = Integer.parseInt(reader.nextLine());
		System.out.print("Type the second number: ");
		int num2 = Integer.parseInt(reader.nextLine());
		
		if (num1 == num2) {
			System.out.println("The numbers are equal!");
		} else if (num1 > num2) {
			System.out.println("Greater number: " + num1);
		} else
			System.out.println("Greater number: " + num2);
	}
}
