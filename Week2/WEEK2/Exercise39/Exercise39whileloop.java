package WEEK2;

public class Exercise39whileloop {
	public static void main(String[] args) {
		// 39.1
		printStars(5);
	    printStars(3);
	    printStars(9);
	    System.out.println("---");
	    // 39.2
	    printSquare(4);
	    System.out.println("---");
	    // 39.3
	    printRectangle(17,3);
	    System.out.println("---");
	    // 39.4
	    printTriangle(4);
	}
	// 39.1
	public static void printStars(int amount) {
		// you can print one star with the command
	    // System.out.print("*");
	    // call this command amount times
		int printed = 0;
		while (printed < amount) {
			System.out.print("*");
			printed++;
		}
		System.out.println();
	}
	// 39.2
	public static void printSquare(int sideSize) {
		int printed = 0;
		while (printed < sideSize) {
			printStars(sideSize);
			printed++;
		}
	}
	// 39.3
	public static void printRectangle(int width, int height) {
		int printed = 0;
		while (printed < height) {
			printStars(width);
			printed++;
		}
		
	}
	// 39.4
	public static void printTriangle(int size) {
		int row = 1;
		while (row <= size) {
			printStars(row);
			row++;
		}
	}
}
