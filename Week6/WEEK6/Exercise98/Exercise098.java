package WEEK6;

import java.util.Arrays;

// Exercise 98: Reversing and copying of an array
public class Exercise098 {
	public static void main(String[] args) {
		int[] original = {1, 2, 3, 4};
	    int[] copied = copy(original);
	    int[] reverse = reverseCopy(original);
	    
	    // change the copied
	    copied[0] = 99;
	    // Exercise 98.1: Copy
	    // print both
	    System.out.println("original: " + Arrays.toString(original));
	    System.out.println("copied: " + Arrays.toString(copied));
	    System.out.println();
	    
	    // Exercise 98.2: Reverse copy
	    // print both
	    System.out.println("original: " +Arrays.toString(original));
	    System.out.println("reversed: " +Arrays.toString(reverse));
	}
	// Exercise 98.1: Copy
	public static int[] copy(int[] array) {
		// Implement the method public static int[] copy(int[] array) that creates a copy of the parameter.
		// since you are supposed to create a copy of the parameter, 
		// the method should create a new array where the contents of the parameter is copied.
		/*int[] copy = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			copy[i] = array[i];
		}
		return copy*/
		
		int[] copy = Arrays.copyOf(array, array.length);
		return copy;
	}
	// Exercise 98.2: Reverse copy
	public static int[] reverseCopy(int[] array) {
		// Implement the method public static int[] reverseCopy(int[] array) that creates an array 
		// which contains the elements of the parameter but in reversed order. 
		// The parameter array must remain the same.
		/*int[] revArr = new int[array.length];
		for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
			revArr[j] = array[i];
		}
		return revArr;*/
		
		int[] revArr = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			revArr[i] = array[array.length - i - 1];
		}
		return revArr;
	}
}
