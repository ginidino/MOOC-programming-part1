package WEEK3;

import java.util.ArrayList;
import java.util.Collections;

// Remove last
// Create the method public static void removeLast(ArrayList<String> list), which removes the last item from the list.
public class Exercise62 {
	public static void main(String[] args) {
		ArrayList<String> brothers = new ArrayList<String>();
		brothers.add("Dick");
		brothers.add("Henry");
		brothers.add("Michael");
		brothers.add("Bob");

		System.out.println("brothers:");
		System.out.println(brothers);
		
		// sorting brothers
		Collections.sort(brothers);
		
		// removing the last item
		removeLast(brothers);
		
		System.out.println(brothers);
	}

	public static void removeLast(ArrayList<String> list) {
		list.remove(list.size()-1);
	}
}
