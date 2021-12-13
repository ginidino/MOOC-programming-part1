package test3;

import java.util.*;

public class Exercise67 {
	public static double variance(ArrayList<Integer> list) {
		double sum = 0;
	    for (double num : list) {
	    	sum += num;
	    }
	    double average =  (double) sum / list.size();
	    double var = 0;
	    for (int lists : list) {
	    	double diff = lists - average;
	    	double square = diff * diff;
	    	var = var + square;
	    }
	    var = var / (list.size() - 1);
	    return var;
	}

	public static void main(String[] args) {
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    list.add(3);
	    list.add(2);
	    list.add(7);
	    list.add(2);

	    System.out.println("The variance is: " + variance(list));
	}
}
