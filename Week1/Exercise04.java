package WEEK1;

import java.util.Scanner;

//Varying variables
public class Exercise04 {
	public static void main(String[] args) {
		int chickenCount = 3;
		double baconWeight = 5.5;
		String tractor = "There is none";
		
		System.out.println("Chickens: \n" + chickenCount);
		System.out.println("Bacon (kg): \n" + baconWeight);
		System.out.println("A tractor: \n" + tractor + "\n");
		System.out.println("In a nutshell: \n" + chickenCount + "\n" + baconWeight + "\n" + tractor);
		System.out.println();
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Chickens: ");
		int chicken = Integer.parseInt(reader.nextLine());
		System.out.println("Bacon (kg): ");
		double bacon = Double.parseDouble(reader.nextLine());
		System.out.println("A tractor: ");
		String tractors = reader.nextLine();
		System.out.println();
		System.out.println("In a nutshell: \n" + chicken + "\n" + bacon + "\n" + tractors);
	}
}