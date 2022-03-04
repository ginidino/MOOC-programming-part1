package WEEK4;

import java.util.Random;

public class PasswordRandomizer {
	// Define the variables here
	private Random random;
	private int length;

	public PasswordRandomizer(int length) {
		// Format the variable here
		this.length = length;
		random = new Random();
	}

	public String createPassword() {
		// Write the code here which returns the new password
		// version 1
		String password = "";
		for (int i = 0; i < this.length; i++) {
			char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(random.nextInt(26));
			password += symbol;
		}
		return password;
	}
}
