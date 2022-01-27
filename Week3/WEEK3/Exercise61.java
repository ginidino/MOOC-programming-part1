package WEEK3;

import java.util.*;

// Amount of items in a list
// Create the method public static int countItems(ArrayList<String> list) that returns the number of the items in the list.
public class Exercise61 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		list.add("Hallo");
		list.add("Ciao");
		list.add("Hello");
		System.out.println("There are this many items in the list:");
		System.out.println(countItems(list));
	}

	public static int countItems(ArrayList<String> list) {
		return list.size();
	}
}
