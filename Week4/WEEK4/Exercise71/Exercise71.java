package WEEK4;

import java.util.ArrayList;
import java.util.Collections;

// Smart combining
// Create the method smartCombine 
// the method adds a new number to the list only if the list does not already contain that number.
// You can use that method to check if a number is in the list.
public class Exercise71 {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		Collections.addAll(list1, 4, 3);
		
		Collections.addAll(list2, 5, 10, 4, 3, 7);
		 
        // remove comment when method ready
        smartCombine(list1, list2);
        System.out.println(list1);
        System.out.println(list2);
	}
	
	public static void smartCombine(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		for (Integer num : list2) {
			if (!list1.contains(num)) {
				list1.add(num);
			}
		}
	}
}
