package test4;

public class Exercise722 {
	public static void main(String[] args) {
		Account accoutOfMatt = new Account("Matt's account", 1000.0);
		accoutOfMatt.withdrawal(100);
		Account myAccount = new Account("My account", 0.0);
		myAccount.deposit(100);
        System.out.println(accoutOfMatt);
        System.out.println(myAccount);
	}
}
