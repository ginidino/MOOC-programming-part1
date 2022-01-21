package WEEK3;

// Average of given numbers
// calculates the average of the numbers it gets as parameters
public class Exercise46 {
	public static void main(String[] args) {
	    double answer = average(4, 3, 6, 1);
	    System.out.println("average: " + answer);
	}

	public static double average(int num1, int num2, int num3, int num4) {
		return (double) (num1 + num2 + num3 + num4) / 4;
	}
}
