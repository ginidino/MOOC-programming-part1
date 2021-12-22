package test5;

public class Exercise84 {
	public static void main(String[] args) {
		Counter c = new Counter(7, true);
		c.decrease(4);
		System.out.println(c.value());
	}
}