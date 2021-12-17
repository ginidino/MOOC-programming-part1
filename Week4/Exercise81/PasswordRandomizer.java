package test4;

import java.util.Random;

public class PasswordRandomizer {
	// Define the variables here
	private Random random = new Random();
	private int length;

	public PasswordRandomizer(int length) {
		// Format the variable here
		this.length = length;
	}

	public String createPassword() {
		// Write the code here which returns the new password
		String symbol = "abcdefghijklmnopqrstuvwxyz";
		String password = "";
		int num = this.length;
		while (num > 0) {
			int i = this.random.nextInt(symbol.length());
			char c = symbol.charAt(i);
			password += c;
			num--;
		}
		return password;
	}
}
