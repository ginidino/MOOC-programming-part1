package test1;
import java.util.Scanner;


public class Exercise16 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Type a number: ");
		int num = Integer.parseInt(reader.nextLine());
		
		if (num % 2 ==0) {
			System.out.println("The number " + num + " is even.");
		} else
			System.out.println("The number " + num + " is odd.");
	}
}
