package test2;

import java.util.*;

public class Exercise41 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int numberDrawn = drawNumber();
		
		int made = 0;
		while (true) {
			System.out.print("Guess a number: ");
            int guess = Integer.parseInt(reader.nextLine());
            made++;
            
            if (guess == numberDrawn) {
                break;
            } else if (guess < numberDrawn) {
                System.out.println("The number is greater, guesses made: " + made);
            } else {
                System.out.println("The number is lesser, guesses made: " + made);
            }
		}
		System.out.println("Congratulations, your guess is correct!");
	}
	private static int drawNumber() {
		return new Random().nextInt(101);
	}
}
