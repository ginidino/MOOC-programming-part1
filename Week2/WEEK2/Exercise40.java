package WEEK2;

// Printing Like A Boss
// 40.1: Printing stars and whitespaces
//  - Create a method printWhitespaces(int size) that prints the given amount of whitespaces
// 40.2: Printing a right-aligned triangle
//  - Create the method printTriangle(int size) that prints a triangle using the mehtods printWhitespaces and printStars
// 40.3: Printing a Christmas tree
//  - Create the method xmasTree(int height) that prints a Christmas tree using the mehtods printWhitespaces and printStars
//  - A Christmas tree consists of a triangle of given height and a stand
//  - The stand is two stars tall and three stars wide and it is located in the center of the bottom of the triangle
public class Exercise40 {
	public static void main(String[] args) {
		printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
	}
	public static void printStars(int amount) {
		for (int i = 0; i < amount; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	// 40.1
	public static void printWhitespaces(int amount) {
		for (int i = 0; i < amount; i++) {
			System.out.print(" ");
		}
	}
	// 40.2
	public static void printTriangle(int size) {
		for (int i = 1; i <= size; i++) {
			printWhitespaces(size - i);
            printStars(i);
		}
	}
	// 40.3
	public static void xmasTree(int height) {
		for (int i = 1; i <= height; i++) {
			printWhitespaces(height - i);
            printStars(i*2-1);
		}
		// the stand
		int root_height = 2;
		for (int i = 0; i < root_height; i++) {
			for (int j = 0; j <= height; j++) {
				if (j == height-2 || j == height-1 || j == height) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}
}
