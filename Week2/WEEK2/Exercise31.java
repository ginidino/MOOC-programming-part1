package WEEK2;

import java.util.Scanner;

// Lower limit and upper limit
// the first number and the last number and then prints all numbers between those two.
public class Exercise31 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("First: ");
        int first = Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        int last = Integer.parseInt(reader.nextLine());
        // while loop
        int num = first;
        while (num <= last) {
        	System.out.println(num);
        	num++;
        }
        System.out.println();
        // for loop
        for (int i = first; i <= last; i++) {
        	System.out.println(i);
        }
        System.out.println();
        // the first number is greater than the last number
        for (int j = first; j >= last; j--) {
        	System.out.println(j);
        }
	}
}
