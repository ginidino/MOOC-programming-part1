package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise62Test {
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
		sort(person);
		print(person);
		removeLast(person);
		print(person);
	}

	public static void sort(ArrayList<String> person) {
		Collections.sort(person);
	}

	public static void print(ArrayList<String> printed) {
		System.out.println(printed);
	}

	public static void removeLast(ArrayList<String> list) {
		int index = list.size() - 1;
		list.remove(index);
	}
}
