package WEEK6;

// Exercise 99: Array to stars
// Implement the method public static printArrayAsStars(int[] array), 
// which prints a line with stars for each number in the array. The line length is determined by the number.
// As seen the first line has 5 stars and the reason for that is that is that the first element of the array is 5. 
// The next line has one star since the second element of the array is 1, etc.
public class Exercise099 {
	public static void main(String[] args) {
		int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
	}

	public static void printArrayAsStars(int[] array) {
		/*for (int i = 0; i < array.length; i++) {
			int num = array[i];
			
			for (int star = 0; star < num; star++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		for (int star : array) {
			for (int i = 0; i < star; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
