package test2;

import java.util.*;

public class Exercise31 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("First: ");
        int first = Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        int last = Integer.parseInt(reader.nextLine());
        
        int num = first;
        while (num <= last) {
        	System.out.println(num);
        	num++;
        }
	}
}
