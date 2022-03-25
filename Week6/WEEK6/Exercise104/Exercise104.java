package WEEK6;

import java.util.Arrays;

// Exercise 104: Sorting
public class Exercise104 {
	public static void main(String[] args) {
		int[] values = {6, 5, 8, 7, 11};
		// Exercise 104.1: Smallest
		System.out.println("smallest: " + smallest(values));
		// Exercise 104.2: The index of the smallest
		System.out.println("Index of the smallest: " + indexOfTheSmallest(values));
		// Exercise 104.3: Index of the smallest at the end of an array
		int[] value = {-1, 6, 9, 8, 12};
		System.out.println(indexOfTheSmallestStartingFrom(value, 1));
		System.out.println(indexOfTheSmallestStartingFrom(value, 2));
		System.out.println(indexOfTheSmallestStartingFrom(value, 4));
		// Exercise 104.4: Swapping values
		int[] values1 = {3, 2, 5, 4, 8};

		System.out.println(Arrays.toString(values1));

		swap(values1, 1, 0);
		System.out.println(Arrays.toString(values1));

		swap(values1, 0, 3);
		System.out.println(Arrays.toString(values1));
		System.out.println();
		// Exercise 104.5: Sorting
		int[] values2 = {8, 3, 7, 9, 1, 2, 4};
		sort(values2);
	}
	// Exercise 104.1: Smallest
	public static int smallest(int[] array) {
		// Implement a method smallest, which returns the smallest value in the array
		/*Arrays.sort(array);
		return array[0];*/
		int smallest = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < smallest) {
				smallest = array[i];
			}
		}
		return smallest;
	}
	// Exercise 104.2: The index of the smallest
	public static int indexOfTheSmallest(int[] array) {
		// returns the index of the smallest value in the array (the position of the value in the array, that is)
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == smallest(array)) {
				index = i;
			}
		}
		return index;
	}
	// Exercise 104.3: Index of the smallest at the end of an array
	public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
		// which works just like the method of the previous assignment, 
		// but only takes into consideration the end of an array starting from a certain index. 
		// In addition to the array the method gets as parameter an index, from which the search for the smallest will be started.
		int startIndex = index;
		for (int i = index; i < array.length; i++) {
			if (array[i] < array[startIndex]) {
				startIndex = i;
			}
		}
		return startIndex;
	}
	// Exercise 104.4: Swapping values
	public static void swap(int[] array, int index1, int index2) {
		// Create a method swap, to which will be passed an array and two of its indexes. 
		// The method swaps the values in the indexes around.
	    int index = array[index1];
	    array[index1] = array[index2];
	    array[index2] = index;
	}
	// Exercise 104.5: Sorting
	public static void sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int index = indexOfTheSmallestStartingFrom(array, i);
			System.out.println(Arrays.toString(array));
			swap(array, index, i);
		}
	}
}
