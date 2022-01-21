package WEEK3;

// Least
// method least, which returns the least of the numbers given as parameters
// If the parameters are equal, you can decide which one is returned.
public class Exercise44 {
	public static void main(String[] args) {
	    int answer =  least(2, 7);
	    System.out.println("Least: " + answer);
	}

	public static int least(int num1, int num2) {
		if (num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}
}
