package WEEK4;

// Exercise 78.2: Printing the initial zero
public class Exercise782 {
	public static void main(String[] args) {
		BoundedCounter counter = new BoundedCounter(14);
        System.out.println("Value at start: " + counter );

        for (int i = 0; i < 16; i++){
            counter.next();
            System.out.println("value: " + counter );
        }
	}
}
