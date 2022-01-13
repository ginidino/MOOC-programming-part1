package WEEK2;

// From hundred to one
// there are 2 version. first version is to use while loop, second version is to use for loop
public class Exercise28 {
	public static void main(String[] args) {
		// while loop
		int num = 100;
		while (num >= 1) {
			System.out.println(num);
			num--;
		}
		System.out.println();
		// for loop
		for (int i = 100; i >= 1; i--) {
			System.out.println(i);
		}
	}
}
