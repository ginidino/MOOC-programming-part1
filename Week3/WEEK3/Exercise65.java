package WEEK3;

import java.util.*;

// The lengths of the Strings
// Create the method lengths that gets a list of String variables as a parameter 
// and returns an ArrayList that contains the lengths of the Strings in the same order as the original list.
public class Exercise65 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Hallo");
	    list.add("Moi");
	    list.add("Benvenuto!");
	    list.add("badger badger badger badger");
	    ArrayList<Integer> lengths = lengths(list);

	    System.out.println("The lengths of the Strings: " + lengths);
	}

	public static ArrayList<Integer> lengths(ArrayList<String> list) {
		ArrayList<Integer> lengths = new ArrayList<Integer>();
		for (String length : list) {
			lengths.add(length.length());
		}
		return lengths;
	}
}
