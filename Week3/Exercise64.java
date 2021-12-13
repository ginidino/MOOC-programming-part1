package test3;

import java.util.*;

public class Exercise64 {
	public static double average(ArrayList<Integer> list) {
	    double sum = 0;
	    for (double num : list) {
	    	sum += num;
	    }
	    return (double) sum / list.size();
	}

	public static void main(String[] args) {
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    list.add(3);
	    list.add(2);
	    list.add(7);
	    list.add(2);

	    System.out.println("The average is: " + average(list));
	}
}
