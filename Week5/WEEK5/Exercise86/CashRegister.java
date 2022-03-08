package WEEK5;

public class CashRegister {
	private double cashInRegister;   // the amount of cash in the register
    private int economicalSold;      // the amount of economical lunches sold
    private int gourmetSold;         // the amount of gourmet lunches sold
    private double priEco = 2.5;
    private double priGou = 4.0;
	
    // Exercise 86.2: Cash Register and paying with cash
	public CashRegister() {
        // at start the register has 1000 euros
		this.cashInRegister = 1000;
    }
	// Exercise 86.2: Cash Register and paying with cash
	public double payEconomical(double cashGiven) {
		// the price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of the sold lunches is incremented by one
        //    the method returns cashGiven - lunch price
        // if not enough money is given, all is returned and nothing else happens
		if (cashGiven >= priEco) {
			this.cashInRegister += priEco;
			this.economicalSold++;
			return cashGiven - priEco;
		} else {
			return cashGiven;
		}
	}
	// Exercise 86.2: Cash Register and paying with cash
	public double payGourmet(double cashGiven) {
		// the price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to the register
        //    the amount of the sold lunches is incremented by one
        //    the method returns cashGiven - lunch price
        // if not enough money is given, all is returned and nothing else happens
		if (cashGiven >= priGou) {
			this.cashInRegister += priGou;
			this.gourmetSold++;
			return cashGiven - priGou;
		} else {
			return cashGiven;
		}
	}
	// Exercise 86.2: Cash Register and paying with cash
	public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
	// Exercise 86.3: Paying with card
	public boolean payEconomical(LyyraCard card) {
		// the price of the economical lunch is 2.50 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
		if (card.balance() >= priEco) {
			card.pay(priEco);
			this.economicalSold++;
			return true;
		} else {
			return false;
		}
	}
	// Exercise 86.3: Paying with card
	public boolean payGourmet(LyyraCard card) {
		// the price of the gourmet lunch is 4.00 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
		if (card.balance() >= priGou) {
			card.pay(priGou);
			this.gourmetSold++;
			return true;
		} else {
			return false;
		}
	}
	// Exercise 86.4: Loading money
	public void loadMoneyToCard(LyyraCard card, double sum) {
		if (sum > 0) {
			card.loadMoney(sum);
			this.cashInRegister += sum;
		}
	}
}
