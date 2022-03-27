package WEEK6;

import java.util.Arrays;
import java.util.Scanner;

// Exercise 106: Implementation of binary search
public class Exercise106 {
	public static void main(String[] args) {
		// Here you can test binary search
		Scanner reader = new Scanner(System.in);
		int[] array = { -3, 2, 3, 4, 7, 8, 12 };
		
		System.out.print("Values of the array: " + Arrays.toString(array));
        System.out.println();
        
        System.out.print("Enter searched number: ");
        String searchedValue = reader.nextLine();
        System.out.println();

        boolean result = BinarySearch.search(array, Integer.parseInt(searchedValue));
        
        // Print the binary search result here
        if (result) {
        	System.out.println("Value " + searchedValue + " is in the array");
        } else {
        	System.out.println("Value " + searchedValue + " is not in the array");
        }
	}
}
