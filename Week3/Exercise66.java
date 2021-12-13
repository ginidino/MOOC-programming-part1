package test3;

import java.util.*;

public class Exercise66 {
	public static int greatest(ArrayList<Integer> list) {
	    return Collections.max(list);
	}

	public static void main(String[] args) {
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    list.add(3);
	    list.add(2);
	    list.add(7);
	    list.add(2);

	    System.out.println("The greatest number is: " + greatest(list));
	}
}
