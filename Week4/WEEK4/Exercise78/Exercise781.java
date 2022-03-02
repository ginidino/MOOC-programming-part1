package WEEK4;

// changed the while loop to for loop
// Exercise 78.1: BoundedCounter
public class Exercise781 {
	public static void main(String[] args) {
		BoundedCounter counter = new BoundedCounter(4);
        System.out.println("Value at start: " + counter );

       for (int i = 0; i < 10; i++) {
            counter.next();
            System.out.println("Value: " + counter);
        }
	}
}
