package WEEK3;

// Greatest
// Create the method greatest, which gets three integers as parameters and then returns the greatest of them
// If there are several parameters that are equally great, you can decide which one is returned
public class Exercise45 {
	public static void main(String[] args) {
	    int answer =  greatest(2, 7, 3);
	    System.out.println("Greatest: " + answer);
	}

	public static int greatest(int num1, int num2, int num3) {
		int max = num1;
		if (max < num2) {
			return num2;
		} else if (max < num3) {
			return num3;
		} else {
			return max;
		}
	}
}
