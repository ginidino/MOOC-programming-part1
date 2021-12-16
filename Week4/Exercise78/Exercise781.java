package test4;

public class Exercise781 {
	public static void main(String[] args) {
        BoundedCounter counter = new BoundedCounter(4);
        System.out.println("Value at start: " + counter );

        int i = 0;
        while ( i < 10) {
            counter.next();
            System.out.println("Value: " + counter );
            i++;
        }
    }
}
