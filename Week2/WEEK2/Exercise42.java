package WEEK2;

import java.util.Scanner;
import hangman.Hangman;

// A text-based user interface for the Hangman game
// 42.1: Loops and ending loops
//  - Ask the user to submit the command inside the loop. If the command is "quit", break the loop.
// 42.2: Printing the status
//  - If the user gives the command "status", print the status using the method hangman.printStatus().
// 42.3: Making a guess
//  - If the user types in a single letter as a command, use it to make a guess. 
//  - Guessing a letter occurs in the method hangman.guess(command)
// 42.4: Printing out the menu
//  - If the user types an empty string of characters, meaning a string that has zero length, you need to call the method printMenu.
// 42.5: Printing the man and the word
//  - If the user has not typed the command quit, you should call the Hangman game commands hangman.printMan() and hangman.printWord() at the end of the loop.
public class Exercise42 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Hangman hangman = new Hangman();

        System.out.println("************");
        System.out.println("* Hangman *");
        System.out.println("************");
        System.out.println("");
        printMenu();
        System.out.println("");
        
        while (hangman.gameOn()) {
        	System.out.println("");
            System.out.println("Type a command: ");
        	String command = reader.nextLine();
        	
        	if (command.equals("quite")) {
        		break;
        	} else if (command.equals("status")) {
        		hangman.printStatus();
        	} else if (command.length() == 1) {
        		hangman.guess(command);
        	} else if (command.isEmpty()) {
                printMenu();
            }
        	hangman.printMan();
            hangman.printWord();
        }
        System.out.println("Thank you for playing!");
	}
	public static void printMenu() {
		System.out.println(" * menu *");
        System.out.println("quit   - quits the game");
        System.out.println("status  - prints the game status");
        System.out.println("a single letter uses the letter as a guess");
        System.out.println("an empty line prints this menu");
	}
}
