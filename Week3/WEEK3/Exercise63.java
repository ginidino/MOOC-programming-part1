package WEEK3;

import java.util.*;

// Sum of the numbers
// Create the method sum, which receives a list of numbers (ArrayList<Integer>) as a parameter 
// and then calculates the sum of the items in that list.
public class Exercise63 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
	    list.add(3);
	    list.add(2);
	    list.add(7);
	    list.add(2);

	    System.out.println("The sum: " + sum(list));

	    list.add(10);

	    System.out.println("the sum: " + sum(list));
	}

	public static int sum(ArrayList<Integer> list) {
		int sum = 0;
		for (int num : list) {
			sum += num;
		}
		return sum;
	}
}
