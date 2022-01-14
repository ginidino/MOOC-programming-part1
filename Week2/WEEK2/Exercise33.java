package WEEK2;

import java.util.Scanner;

// The sum between two numbers
// ask for both the lower and upper bound
// the users first gives the smaller number and then the greater number
public class Exercise33 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("First: ");
	    int first = Integer.parseInt(reader.nextLine());
	    System.out.print("Last: ");
	    int last = Integer.parseInt(reader.nextLine());
	    // while loop
	    int sum = 0;
	    int num = first;
	    while (num <= last) {
	    	sum += num;
	    	num++;
	    }
	    System.out.println("The sum is " + sum);
	    System.out.println();
	    // for loop
	    int result = 0;
	    for (int i = first; i <= last; i++) {
	    	result += i;
	    }
	    System.out.println("The sum is " + result);
	    System.out.println();
	    // the first number is greater than the last number
	    int total = 0;
	    for (int j = first; j >= last; j--) {
	    	total += j;
	    }
	    System.out.println("The sum is " + total);
	}
}
