package WEEK6;

// Exercise 96: Sum of the array
// Implement the method public static sum(int[] array), which returns the sum of the numbers in the array given as parameter.
public class Exercise096 {
	public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        System.out.println(sum(array));
    }
	// using for each loop
	public static int sum(int[] array) {
		int sum = 0;
		for (int num : array) {
			sum += num;
		}
		return sum;
	}
}
