package WEEK3;

import java.util.ArrayList;

// Average of numbers
// Create the method average, which receives a list of numbers (ArrayList<Integer>) as a parameter 
// and then calculates the average of the items in that list.
public class Exercise64 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
	    list.add(3);
	    list.add(2);
	    list.add(7);
	    list.add(2);

	    System.out.println("The average is: " + average(list));
	}

	public static double average(ArrayList<Integer> list) {
		int sum = 0;
		double average = 0;
		for (int num : list) {
			sum += num;
		}
		average = (double) sum / list.size();
		return average;
	}
}
