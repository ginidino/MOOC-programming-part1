package test4;

public class Product {
	private String name;
	private double price;
	private double amount;
	
	public Product(String nameAtStart, double priceAtStart, double amountAtStart) {
		this.name = nameAtStart;
		this.price = priceAtStart;
		this.amount = amountAtStart;
	}

	public void printProduct() {
		System.out.println(this.name + ", price " + this.price + ", amount" + this.amount);
	}
}
