package WEEK4;

// Exercise 72.2: Your first money transfer
public class Exercise722 {
	public static void main(String[] args) {
		Account accoutOfMatt = new Account("Matt's account", 1000.0);
		Account Myaccount = new Account("My account", 0.0);
		accoutOfMatt.withdrawal(100);
		Myaccount.deposit(100);
		System.out.println(accoutOfMatt);
        System.out.println(Myaccount);
	}
}
