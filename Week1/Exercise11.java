package WEEK1;

import java.util.Scanner;

//Bigger number
//prints the larger of the two
public class Exercise11 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Type a number: ");
		int num1 = Integer.parseInt(reader.nextLine());
		System.out.print("Type another number: ");
		int num2 = Integer.parseInt(reader.nextLine());
		
		int result = Math.max(num1, num2);
		System.out.println("The bigger number of the two numbers given was: " + result);
		System.out.println();
		
		if(num1 - num2 > 0) {
			System.out.println("The bigger number of the two numbers given was: " + num1);
		} else if (num1 - num2 < 0) {
			System.out.println("The bigger number of the two numbers given was: " + num2);
		} else {
			System.out.println("Two integers num1 and num2 are equal.");
		}
	}
}
