package Test;

import java.util.Scanner;
import java.util.Random;

// create random password by using lowercase
public class PasswordRandomizer {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Random random = new Random();
		System.out.println("Enter a length of password");
		int len = Integer.parseInt(reader.nextLine());
		String password = "";
		for (int i = 0; i < len; i++) {
			char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(random.nextInt(26));
			password += symbol;
		}
		System.out.println(password);
	}
}
