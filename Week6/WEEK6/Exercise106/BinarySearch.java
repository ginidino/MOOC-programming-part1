package WEEK6;

// Exercise 106: Implementation of binary search
public class BinarySearch {

	public static boolean search(int[] array, int searchedValue) {
		int buttom = 0;
		int top = array.length - 1;
		
		while (top <= buttom) {
			int middle = (top + buttom) / 2;
			if (array[middle] == searchedValue) {
				return true;
			} else if (array[middle] < searchedValue) {
				buttom = middle + 1;
			} else {
				top = middle - 1;
			}
		}
		return false;
	}
}
