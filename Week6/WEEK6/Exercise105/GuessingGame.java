package WEEK6;

import java.util.Scanner;

public class GuessingGame {
	private Scanner reader;
	
	public GuessingGame() {
		this.reader = new Scanner(System.in);
	}

	public void play(int lowerLimit, int upperLimit) {
		instructions(lowerLimit, upperLimit);
		// write the game logic here
		// Exercise 105.3: Guessing logic
		while(true) {
			int middle = average(lowerLimit, upperLimit);
			if (isGreaterThan(middle)) {
				lowerLimit = middle + 1;
			} else {
				upperLimit = middle;
			}
			
			if (upperLimit == lowerLimit) {
				System.out.println("The number you're thinking of is " + lowerLimit + ".");
				break;
			}
		}
	}
	// implement here the methods isGreaterThan and average
	// Exercise 105.1: Is greater than
	// The method returns the value true if the user replies "y", otherwise false.
	public boolean isGreaterThan(int value) {
		System.out.println("Is your number greater than " + value + " (y/n)");
		String answer = reader.nextLine();
		if (answer.equals("y")) {
			return true;
		} else {
			return false;
		}	
	}
	// Exercise 105.2: Average
	// Implement the method public int average(int firstNumber, int secondNumber), which calculates the average of the given values. 
	// Notice that Java rounds floating numbers down automatically, in our case this is perfectly fine.
    public int average(int firstNumber, int secondNumber) {
		return (firstNumber + secondNumber) / 2;
	}
	
	public void instructions(int lowerLimit, int upperLimit) {
		int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");

        System.out.println("I promise you that I can guess the number you are thinking of with " + maxQuestions + " questions.");
        System.out.println("");
        System.out.println("Next I'll present you with a series of questions. Answer them honestly.");
        System.out.println("");
	}
	// a helper method:
    public static int howManyTimesHalvable(int number) {
        // we create a base two logarithm  of the given value
        // Below we swap the base number to base two logarithms!
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }
}
