package test4;

public class LyyraCard {
	private double balance;
	private final double Eco = 2.5;
	private final double Gou = 4.0;
	
	public LyyraCard(double balanceAtStart) {
		this.balance = balanceAtStart;
	}
	public void payEconomical() {
		if (this.balance >= Eco) {
			this.balance -= Eco;
		}
	}
	public void payGourmet() {
		if (this.balance >= Gou) {
			this.balance -= Gou;
		}
	}
	public String toString() {
		return "The card has " + this.balance + " euros";
	}
	public void loadMoney(double amount) {
		if (amount < 0) {
			return;
		}
		this.balance += amount;
		if (this.balance > 150) {
			this.balance = 150;
		}
	}
}
