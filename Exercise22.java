package test1;
import java.util.Scanner;

public class Exercise22 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String password = "carrot";
		
		while (true) {
			System.out.print("Type the password: ");
			String readPassword = reader.nextLine();
			
			if(readPassword.equals(password)) {
				System.out.println("Right");
				break;
			} else
				System.out.println("Wrong");
		}
		System.out.println("\n" + "The secret is: jryy qbar!");
	}
}
