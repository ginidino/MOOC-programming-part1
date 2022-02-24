package WEEK4;

public class Account {
	private String owner;
	private double balance;

	public Account(String owner, double balance) {
		this.owner = owner;
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}

	public void withdrawal(double amount) {
		balance -= amount;
	}

	public double balance() {
		return balance;
	}
	
	public String toString() {
        return owner + " balance: " + balance;
    }
}
