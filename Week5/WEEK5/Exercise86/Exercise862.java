package WEEK5;

// Exercise 86.2: Cash Register and paying with cash
public class Exercise862 {
	public static void main(String[] args) {
		CashRegister unicafeExactum = new CashRegister();

        double theChange = unicafeExactum.payEconomical(10);
        System.out.println("the change was " + theChange );

        theChange = unicafeExactum.payEconomical(5);
        System.out.println("the change was "  + theChange );

        theChange = unicafeExactum.payGourmet(4);
        System.out.println("the change was "  + theChange );

        System.out.println(unicafeExactum);
	}
}
