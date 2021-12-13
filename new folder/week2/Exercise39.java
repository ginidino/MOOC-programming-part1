package test2;

public class Exercise39 {
	public static void main(String[] args) {
		printStars(5);
	    printStars(3);
	    printStars(9);
	    System.out.println("---");
	    printSquare(4);
	    System.out.println("---");
	    printRectangle(17,3);
	    System.out.println("---");
	    printTriangle(4);
	}
	// 39.1
	public static void printStars(int amount) {
		for (int i = 0; i < amount; i++) {
			System.out.print("*");
		}
		System.out.println(" ");
	}
	// 39.2
	public static void printSquare(int sideSize) {
		for (int i = 0; i < sideSize; i++) {
			printStars(sideSize);
		}
	}
	//39.3
	public static void printRectangle(int width, int height) {
		for (int i = 0; i < height; i++) {
			printStars(width);
		}
	}
	//39.4
	public static void printTriangle(int size) {
		for (int i = 1; i <= size; i++) {
			printStars(i);
		}
	}
}
