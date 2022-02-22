package WEEK4;

import java.util.ArrayList;

// Combining ArrayLists
// Create the method public static void combine(ArrayList<Integer> first, ArrayList<Integer> second) 
// that inserts the items in a list called second to a list called first
// The order of the items can be anything and the same item can appear in the list more than once
// use the method addAll provided by the ArrayList class to add one list in another list
// The list gets the other list, whose items are to be added, as a parameter.
public class Exercise70 {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list1.add(4);
		list1.add(3);

		list2.add(5);
		list2.add(10);
		list2.add(7);

		combine(list1, list2);

		System.out.println(list1); // prints [4, 3, 5, 10, 7]

		System.out.println(list2); // prints [5, 10, 7]
	}

	public static void combine(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		list1.addAll(list2);
	}
}
