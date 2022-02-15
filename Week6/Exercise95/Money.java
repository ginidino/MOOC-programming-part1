package test6;

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
	
	public Money plus(Money added) {
		int euSum = euros + added.euros();
		int ceSum = cents + added.cents();
		if (ceSum > 99) {
			ceSum -= 100;
			euSum++;
		}
		return new Money(euSum, ceSum);
	}
	
	public String toString() {
		String zero = "";
		if (cents <= 10) {
			zero = "0";
		}
		return euros + "." + zero + cents + "e";
	}

	public boolean less(Money compared) {
		if (100 * euros + cents < 100 * compared.euros + compared.cents) {
			return true;
		} else 
		return false;
	}

	public Money minus(Money decremented) {
		int eudiff = euros - decremented.euros();
		int cediff = cents - decremented.cents();
		if (cediff < 0) {
			cediff += 100;
			eudiff--;
		}
		if (eudiff < 0) {
			return new Money(0, 0);
		}
		return new Money(eudiff, cediff);
	}
}
