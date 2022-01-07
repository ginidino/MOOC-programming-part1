package WEEK1;

import java.util.Scanner;

//Calculating the circumference
//formula 2 * pi * radius
//the radius and then calculates the circumference using the given radius
//using Math.PI variable
public class Exercise10 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Type the radius: ");
		int radius = Integer.parseInt(reader.nextLine());
		double result = 2 * Math.PI * radius;
		
		System.out.println("Circumference of the circle: " + result);
	}
}
