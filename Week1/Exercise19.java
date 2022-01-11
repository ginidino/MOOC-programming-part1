package WEEK1;

import java.util.Scanner;

//asks for the user's age and checks that it is reasonable (at least 0 and at most 120).
public class Exercise19 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		while(true) {
			System.out.print("How old are you? ");
			int age = Integer.parseInt(reader.nextLine());
			
			if (age >= 0 && age <= 120) {
				System.out.println("OK");
			} else {
				System.out.println("Impossible");
				break;
			}
		}
	}
}
