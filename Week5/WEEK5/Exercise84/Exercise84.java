package WEEK5;

// Exercise 84: Overloaded counter
public class Exercise84 {
	public static void main(String[] args) {
		// Exercise 84.1: Multiple constructors
		Counter counter = new Counter(7, true);
		counter.increase(); 
		System.out.println(counter.value()); // 8
		counter.decrease(); 
		System.out.println(counter.value()); // 7
		System.out.println();
		
		//Exercise 84.2: Alternative methods
		counter.increase(2);
		System.out.println(counter.value()); // 9
		
		counter.decrease(4);
		System.out.println(counter.value()); // 5
		
		counter.decrease(9);
		System.out.println(counter.value()); // 5
	}
}
