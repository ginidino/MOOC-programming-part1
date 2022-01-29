package test5;

public class Exercise86 {
	public static void main(String[] args) {
		LyyraCard cardOfPekka = new LyyraCard(10);
		CashRegister unicafeExactum = new CashRegister();
		
		System.out.println("money on the card " + cardOfPekka.balance() );
        boolean succeeded = cardOfPekka.pay(8);
        System.out.println("money taken: " + succeeded);
        System.out.println("money on the card " + cardOfPekka.balance() );

        succeeded = cardOfPekka.pay(4);
        System.out.println("money taken: " + succeeded);
        System.out.println("money on the card " + cardOfPekka.balance() );
        System.out.println();
        double theChange = unicafeExactum.payEconomical(10);
        System.out.println("the change was " + theChange );

        theChange = unicafeExactum.payEconomical(5);
        System.out.println("the change was "  + theChange );

        theChange = unicafeExactum.payGourmet(4);
        System.out.println("the change was "  + theChange );

        System.out.println(unicafeExactum);
        System.out.println();
        
        double thChange = unicafeExactum.payEconomical(10);
        System.out.println("the change was " + thChange );

        LyyraCard cardOfJim = new LyyraCard(7);

        boolean succeede = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeede);
        succeede = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeede);
        succeede = unicafeExactum.payEconomical(cardOfJim);
        System.out.println("payment success: " + succeede);

        System.out.println(unicafeExactum);
        System.out.println();
        
        System.out.println( unicafeExactum );

        LyyraCard cardOJim = new LyyraCard(2);

        System.out.println("the card balance " + cardOJim.balance() + " euros");

        boolean succeedd = unicafeExactum.payGourmet(cardOJim);
        System.out.println("payment success: " + succeedd);

        unicafeExactum.loadMoneyToCard(cardOJim, 100);

        succeedd = unicafeExactum.payGourmet(cardOJim);
        System.out.println("payment success: " + succeedd);

        System.out.println("the card balance " + cardOJim.balance() + " euros");

        System.out.println(unicafeExactum);
	}
}
