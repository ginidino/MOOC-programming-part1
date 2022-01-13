package WEEK2;

// From one to a hundred
// there are 2 version. first version is to use while loop, second version is to use for loop
public class Exercise27 {
	public static void main(String[] args) {
		// while loop
		int num = 1;
		while (num <= 100) {
			System.out.println(num);
			num++;
		}
		System.out.println();
		// for loop
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
	}
}
