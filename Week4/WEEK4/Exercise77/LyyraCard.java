package WEEK4;

public class LyyraCard {
	private double balance;
	private double payEco = 2.5;
	private double payGou = 4.0;
	
	//77.1
	public LyyraCard(double balanceAtStart) {
		this.balance = balanceAtStart;
	}
	//77.1
	public String toString() {
        return "The card has " + this.balance + " euros";
    }
	
	public void payEconomical() {
		// 77.2: Paying with card
		//this.balance -= payEco;
		
		// 77.3: Balance nonnegative
	    if (this.balance >= payEco) {
	    	this.balance -= payEco;
	    }
	}
	
	public void payGourmet() {
		// 77.2: Paying with card
		//this.balance -= payGou;
		
		// 77.3: Balance nonnegative
		if (this.balance >= payGou) {
	    	this.balance -= payGou;
	    }
	}
	
	public void loadMoney(double amount) {
		// 77.5: Loading a negative amount
	    if (amount < 0) {
	    	return;
	    }
	    // 77.4: Loading money to card
	    this.balance += amount;
	    if (this.balance >= 150) {
	    	this.balance = 150;
	    }
	}
}
