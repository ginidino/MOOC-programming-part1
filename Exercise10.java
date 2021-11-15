package test1;
import java.util.Scanner;

public class Exercise10 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Type the radius: ");
		double Radius = Double.parseDouble(reader.nextLine());
		
		double Circle = Radius * Math.PI * 2;
		System.out.println("Circumference of the circle: " + Circle);
	}
}
