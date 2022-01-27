package Test;

import java.util.*;

public class Exercise62while {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ArrayList<String> person = new ArrayList<String>();
		System.out.println("brothers");
		while(true) {
			String brothers = reader.nextLine();
			
			if(brothers.isEmpty()) {
				break;
			}
			person.add(brothers);
		}
		System.out.println(person);
		Collections.sort(person);
		person.remove(person.size()-1);
		System.out.println(person);
	}
}
