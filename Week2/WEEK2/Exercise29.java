package WEEK2;

// Even numbers between 2 and 100.
// there are 2 version. first version is to use while loop, second version is to use for loop
public class Exercise29 {
	public static void main(String[] args) {
		// while loop
		int num = 2;
		while (num <= 100) {
			System.out.println(num);
			num += 2;
		}
		System.out.println();
		// for loop
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}
