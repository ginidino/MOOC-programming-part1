package test6;

import java.util.Arrays;

public class Exercise104 {
	public static void main(String[] args) {
		//int[] values = {6, 5, 8, 7, 11};
		//int[] values = {-1, 6, 9, 8, 12};
		int[] values = {3, 2, 5, 4, 8};
		int[] value = {8, 3, 7, 9, 1, 2, 4};
		System.out.println("smallest: " + smallest(values));
		System.out.println();
		
		System.out.println("Index of the smallest: " + indexOfTheSmallest(values));
		System.out.println();
		
		System.out.println(indexOfTheSmallestStartingFrom(values, 1));
		System.out.println(indexOfTheSmallestStartingFrom(values, 2));
		System.out.println(indexOfTheSmallestStartingFrom(values, 4));
		System.out.println();
		
		System.out.println(Arrays.toString(values));

		swap(values, 1, 0);
		System.out.println(Arrays.toString(values));

		swap(values, 0, 3);
		System.out.println(Arrays.toString(values));
		System.out.println();
		
		sort(value);
	}

	public static int smallest(int[] values) {
		int smallest = values[0];
		for (int i = 0; i < values.length; i++) {
			if (values[i] < smallest) {
				smallest = values[i];
			}
		}
		return smallest;
	}
	
	public static int indexOfTheSmallest(int[] values) {
		int index = 0;
		for (int i = 0; i < values.length; i++) {
			if (values[i] == smallest(values)) {
				index = i;
			}
		}
		return index;
	}
	
	public static int indexOfTheSmallestStartingFrom(int[] values, int startIndex) {
		int index = startIndex;
		for (int i = startIndex; i < values.length; i++) {
			if (values[i] < values[index]) {
				index = i;
			}
		}
		return index;
	}
	
	public static void swap(int[] values, int index1, int index2) {
		int index = values[index1];
		values[index1] = values[index2];
		values[index2] = index;
	}
	
	public static void sort(int[] values) {
		for (int i = 0; i < values.length; i++) {
			int index = indexOfTheSmallestStartingFrom(values, i);
			System.out.println(Arrays.toString(values));
			swap(values, index, i);
		}
	}
}
