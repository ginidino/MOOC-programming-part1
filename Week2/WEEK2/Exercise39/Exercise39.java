package WEEK2;

// Printing
// 39.1: Printing stars
// 39.2: Printing a square
//  - Create a method printSquare(int sideSize) that prints a square using our previous method printStars
//  - The method call printSquare(4)
// 39.3: Printing a rectangle
//  - Create a method printRectangle(int width, int height) that prints a rectangle using the printStars method
//  - The call printRectangle(17,3)
// 39.4: Printing a left-aligned triangle
//  - Create the method printTriangle(int size) that prints a triangle using the printStars method
//  - The method call printTriangle(4)
public class Exercise39 {
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
		for (int i = 0; i < amount; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	// 39.2
	public static void printSquare(int sideSize) {
		for (int i = 0; i < sideSize; i++) {
			printStars(sideSize);
		}
	}
	// 39.3
	public static void printRectangle(int width, int height) {
		for (int i = 0; i < height; i++) {
			printStars(width);
		}
		
	}
	// 39.4
	public static void printTriangle(int size) {
		for (int i = 1; i <= size; i++) {
			printStars(i);
		}
	}
}
