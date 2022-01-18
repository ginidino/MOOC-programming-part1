package WEEK2;

public class Exercise40whileloop {
	public static void main(String[] args) {
		printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
	}
	public static void printStars(int amount) {
		int printed = 0;
		while (printed < amount) {
			System.out.print("*");
			printed++;
		}
		System.out.println();
	}
	// 40.1
	public static void printWhitespaces(int amount) {
		int i = 0;
		while (i < amount) {
			System.out.print(" ");
			i++;
		}
	}
	// 40.2
	public static void printTriangle(int size) {
		int i = 1;
		while (i <= size) {
			printWhitespaces(size - i);
            printStars(i);
            i++;
		}
	}
	// 40.3
	public static void xmasTree(int height) {
		int i = 1;
		while (i <= height) {
			printWhitespaces(height - i);
            printStars(i*2-1);
            i++;
		}
		// the stand:
        printWhitespaces(height - 2);
        printStars(3);
        printWhitespaces(height - 2);
        printStars(3);
	}
}
