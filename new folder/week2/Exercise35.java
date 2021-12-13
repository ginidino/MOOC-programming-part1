package test2;

import java.util.Scanner;

public class Exercise35 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Type a number:  ");
		int n = Integer.parseInt(reader.nextLine());
		int result = 0;
		
		int num = 0;
		while (num <= n) {
			int power = (int)Math.pow(2, num);
			result += power;
			num++;
		}
		System.out.println("The result is " + result);
	}
}
