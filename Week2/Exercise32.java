package test2;

import java.util.Scanner;

public class Exercise32 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Until what? ");
        int limit = Integer.parseInt(reader.nextLine());
        
        int sum = 0;
        int num = 1;
        while (num <= limit) {
        	sum += num;
        	num++;
        }
        System.out.println("Sum is " + sum);
	}
}
