package test1;
import java.util.Scanner;

public class Exercise20 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Type your username: ");
		String user = reader.nextLine();
		System.out.print("Type your password: ");
		String pass = reader.nextLine();
		
		if (user.equals("alex") && pass.equals("mightyducks") || user.equals("emily") && pass.equals("cat")) {
			System.out.println("You are now logged into the system!");
		} else
			System.out.println("Your username or password was invalid!");
	}
}
