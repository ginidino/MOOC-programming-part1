package test2;

import java.util.*;

public class Exercise33 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("First: ");
	    int first = Integer.parseInt(reader.nextLine());
	    System.out.print("Last: ");
	    int last = Integer.parseInt(reader.nextLine());
	    
	    int sum = 0;
	    int num = first;
	    while (num <= last) {
	    	sum += num;
	    	num++;
	    }
	    System.out.println("The sum is " + sum);
	}
}
