package WEEK4;

// Exercise 81: Password randomizer
public class Exercise81 {
	public static void main(String[] args) {
		PasswordRandomizer randomizer = new PasswordRandomizer(13);
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
	}
}
