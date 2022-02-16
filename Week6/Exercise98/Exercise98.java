package test6;

import java.util.Arrays;

public class Exercise98 {
	public static void main(String[] args) {
		int[] original = {1, 2, 3, 4};
	    int[] copied = copy(original);
	    int[] reverse = reverseCopy(original);

	    // change the copied
	    copied[0] = 99;

	    // print both
	    System.out.println("original: " + Arrays.toString(original));
	    System.out.println("copied: " + Arrays.toString(copied));
	    System.out.println("reversed: " +Arrays.toString(reverse));
	}
	//98.1
	public static int[] copy(int[] original) {
		int[] copy = new int[original.length];
		for (int i = 0; i < original.length; i++) {
			copy[i] = original[i];
		}
		return copy;
	}
	//98.2
	public static int[] reverseCopy(int[] original) {
		int[] rev = new int[original.length];
		for (int i = 0; i < original.length; i++) {
			rev[i] = original[original.length - i - 1];
		}
		return rev;
	}
}
