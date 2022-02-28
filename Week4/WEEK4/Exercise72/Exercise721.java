package WEEK4;

// Exercise72.1: Your first account
public class Exercise721 {
	public static void main(String[] args) {
		Account bartosAccount = new Account("Barto's account",100.0);
		bartosAccount.deposit(20.0);
		System.out.println(bartosAccount);
	}
}
