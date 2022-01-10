package WEEK1;

import java.util.Scanner;

//whether the user has reached the age of majority
//18 years old or older
//using while loop
public class Exercise15 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		while (true) {
			System.out.print("How old are you? ");
			int age = Integer.parseInt(reader.nextLine());
			if (age < 0) {
				break;
			}
			if (age >= 18) {
				System.out.println("You have reached the age of majority!");
			} else {
				System.out.println("You have not reached the age of majority yet!");
			}
		}
	}
}
