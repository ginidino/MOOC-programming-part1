package WEEK1;

import java.util.Scanner;

//Divider
//two integers and prints their quotient
//Make sure that 3 / 2 = 1.5.
public class Exercise09 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Type a number: ");
		int num1 = Integer.parseInt(reader.nextLine());
		System.out.print("Type another number: ");
		int num2 = Integer.parseInt(reader.nextLine());
		
		double result = (double)num1 / num2;
		System.out.print("Division: " +  num1 + " / " + num2 + " = " + result);
	}
}
