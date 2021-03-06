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
		
		// version 2
		String symbol = "abcdefghijklmnopqrstuvwxyz";
		String password = "";
		for (int i = this.length; i > 0; i--) {
			int numOfChar = random.nextInt(symbol.length());
			char c = symbol.charAt(numOfChar);
			password += c;
		}
		return password;
	}
}
