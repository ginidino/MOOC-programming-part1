package test1;
import java.util.Scanner;

public class Exercise14 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Type a number: ");
		int num = Integer.parseInt(reader.nextLine());
		
		if (num > 0) {
			System.out.println("The number is positive.");
		} else
			System.out.println("The number is not positive.");
	}
}
