package WEEK1;

//Spruce
public class Exercise03 {
	public static void main(String[] args) {
		System.out.println("    *");
        System.out.println("   ***");
        System.out.println("  *****");
        System.out.println(" *******");
        System.out.println("*********");
        System.out.println("    *");
        System.out.println();
        
        
        // print star and root
        int height = 5;
        for (int i = 1; i <= height; i++) {
        	for(int space = 1; space <= height-i; space++) {
				System.out.print(" ");
			}
        	for(int star = 1; star <= i*2-1; star++) {
				System.out.print("*");
			}
			System.out.println(" ");
        }
        int root = 1;
        for (int i = 0; i < root; i++) {
			for (int j = 0; j <= height; j++) {
				if (j == height - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}
}
