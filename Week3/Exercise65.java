package test3;

import java.util.*;

public class Exercise65 {
	public static ArrayList<Integer> lengths(ArrayList<String> list) {
		ArrayList<Integer> lengths = new ArrayList<Integer>();
		for (String s : list) {
			lengths.add(s.length());
		}
		return lengths;
	}

	public static void main(String[] args) {
	    ArrayList<String> list = new ArrayList<String>();
	    list.add("Hallo");
	    list.add("Moi");
	    list.add("Benvenuto!");
	    list.add("badger badger badger badger");
	    ArrayList<Integer> lengths = lengths(list);

	    System.out.println("The lengths of the Strings: " + lengths);
	}
}
