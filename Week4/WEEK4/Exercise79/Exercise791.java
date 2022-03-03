package WEEK4;

// Exercise 79.1: Amount of numbers
public class Exercise791 {
	public static void main(String[] args) {
		NumberStatistics stats = new NumberStatistics();
	      stats.addNumber(3);
	      stats.addNumber(5);
	      stats.addNumber(1);
	      stats.addNumber(2);
	      System.out.println("Amount: " + stats.amountOfNumbers());
	}
}