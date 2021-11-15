package test1;
import java.util.Scanner;

public class Exercise9 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Type a number: ");
		int num1 = Integer.parseInt(reader.nextLine());
		System.out.print("Type another number: ");
		int num2 = Integer.parseInt(reader.nextLine());
		
		double result = (double)num1 / num2;
		System.out.print("Division: " +  num1 + " / " + num2 + " = " + result);
	}
}
