package WEEK5;

public class Apartment {
	private int rooms;
	private int squareMeters;
	private int pricePerSquareMeter;

	public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
		this.rooms = rooms;
		this.squareMeters = squareMeters;
		this.pricePerSquareMeter = pricePerSquareMeter;
	}
	// Exercise 87: Apartment comparison
	public boolean larger(Apartment otherApartment) {
		if (this.squareMeters > otherApartment.squareMeters) {
			return true;
		} else {
			return false;
		}
	}
	// Exercise 87.2: Price difference
	public int priceDifference(Apartment otherApartment) {
		// The price of an apartment is squareMeters * pricePerSquareMeter
		int thisPrice = this.squareMeters * this.pricePerSquareMeter;
		int otherApartPrice = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
		return Math.abs(thisPrice - otherApartPrice);
	}
	// Exercise 87.3: more expensive than
	public boolean moreExpensiveThan(Apartment otherApartment) {
		int thisPrice = this.squareMeters * this.pricePerSquareMeter;
		int otherApartPrice = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
		if (thisPrice > otherApartPrice) {
			return true;
		} else {
			return false;
		}
	}
}
