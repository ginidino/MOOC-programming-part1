package test3;

public class Exercise45 {
	public static void main(String[] args) {
		int answer =  greatest(2, 7, 3);
	    System.out.println("Greatest: " + answer);
	}
	public static int greatest(int num1, int num2, int num3) {
		int greatest = num1;
		if (num2 > greatest) {
			greatest = num2;
		} else if (num3 > greatest) {
			greatest = num3;
		}
		return greatest;
	}
}
