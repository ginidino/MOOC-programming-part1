package Test;

import java.util.*;

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
		brothers.remove(brothers.size()-1);
		
		System.out.println(brothers);
	}
}
