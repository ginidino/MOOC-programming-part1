package WEEK6;

public class Money {
	private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }
        return euros + "." + zero + cents + "e";
    }
    // Exercise 95.1: Plus
	public Money plus(Money added) {
		int euSum = euros + added.euros();
		int centSum = cents + added.cents;
		if (centSum > 99) {
			centSum -= 100;
			euSum++;
		}
		return new Money(euSum, centSum);
	}
	// Exercise 95.2: less
	public boolean less(Money compared) {
		if (100 * euros + cents < 100 * compared.euros + compared.cents) {
			return true;
		} else {
			return false;
		}
	}
	// Exercise 95.3: Minus
	public Money minus(Money decremented) {
		int euDiff = euros - decremented.euros();
		int centDiff = cents - decremented.cents();
		if (centDiff < 0) {
			centDiff += 100;
			euDiff--;
		}
		if (euDiff < 0) {
			return new Money(0, 0);
		}
		return new Money(euDiff, centDiff);
	}
}
