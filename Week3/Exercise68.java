package test3;

import java.util.*;

public class Exercise68 {
	public static boolean moreThanOnce(ArrayList<Integer> list, int number) {
	    // write your code here
		int howMany = 0;
		for (int numList : list) {
			if (numList == number) {
				howMany ++;
			} 
			if (howMany > 1) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
	    Scanner reader = new Scanner(System.in);

	    ArrayList<Integer> list = new ArrayList<Integer>();
	    list.add(3);
	    list.add(2);
	    list.add(7);
	    list.add(2);

	    System.out.println("Type a number: ");
	    int number = Integer.parseInt(reader.nextLine());
	    if (moreThanOnce(list, number)) {
	        System.out.println(number + " appears more than once.");
	    } else {
	        System.out.println(number + " does not appear more than once.");
	    }
	}
}
