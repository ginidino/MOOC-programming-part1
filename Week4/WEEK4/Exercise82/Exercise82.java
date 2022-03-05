package WEEK4;

import java.util.ArrayList;

// Exercise 82: Lottery
public class Exercise82 {
	public static void main(String[] args) {
		LotteryNumbers lotteryNumbers = new LotteryNumbers();
		ArrayList<Integer> numbers = lotteryNumbers.numbers();
		
		System.out.println("Lottery numbers:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
	}
}
