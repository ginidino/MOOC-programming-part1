package test2;

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
		System.out.println(" ");
	}
	// 40.1
	public static void printWhitespaces(int amount) {
		for (int i = 0; i < amount; i++) {
			System.out.print(" ");
		}
	}
	//40.2
	public static void printTriangle(int size) {
		for (int i = 1; i <= size; i++) {
			printWhitespaces(size - i);
            printStars(i);
		}
	}
	//40.3
	public static void xmasTree(int height) {
		for (int i = 1; i <= height; i++) {
			printWhitespaces(height - i);
            printStars(i*2-1);
		}
		// the stand:
        printWhitespaces(height - 2);
        printStars(3);
        printWhitespaces(height - 2);
        printStars(3);
	}
}
