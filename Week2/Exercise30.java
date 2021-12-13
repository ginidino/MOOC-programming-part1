package test2;

import java.util.*;

public class Exercise30 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Up to what number? ");
        int last = Integer.parseInt(reader.nextLine());
        
        int num = 1;
        while(num <= last) {
        	System.out.println(num);
        	num++;
        }
	}
}
