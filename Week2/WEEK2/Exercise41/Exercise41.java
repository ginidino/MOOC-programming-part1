package WEEK2;

import java.util.Scanner;
import java.util.Random;

// Guessing a number game
// 41.1: Guessing a number
//  - It draws a number, which is in the range 0 to 100 (both 0 and 100 are possible)
//  - Then the user has the chance to guess once, what the number is
//  - print "The number is lesser", "The number is greater" or "Congratulations, your guess is correct!" depending on the number the user typed
// 41.2: Repeated guessing
//  - the guessing should be made repeatedly until the user types the right number
// 41.3: Counting the guesses
//  - the program needs to include a variable of type int, which is used to count the guesses the user has made
public class Exercise41 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int numberDrawn = drawNumber();
		int count = 0;
		
		while (true) {
			System.out.print("Guess a number: ");
            int guess = Integer.parseInt(reader.nextLine());
            count++;
            
            if (guess > numberDrawn) {
            	System.out.println("The number is lesser, guesses made: " + count);
            } else if (guess < numberDrawn) {
            	System.out.println("The number is greater, guesses made: " + count);
            }
            if (guess == numberDrawn) {
            	System.out.println("Congratulations, your guess is correct! " + count);
            	break;
            }
		}
		
	}

	public static int drawNumber() {
		return new Random().nextInt(101);
	}
}
