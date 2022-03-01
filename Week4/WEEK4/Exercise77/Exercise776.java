package WEEK4;

// Exercise 77.6: Multiple cards
public class Exercise776 {
	public static void main(String[] args) {
		LyyraCard cardPekka = new LyyraCard(20);
        LyyraCard cardBrian = new LyyraCard(30);
        
        cardPekka.payGourmet();
        cardBrian.payEconomical();
        
        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);
        
        cardPekka.loadMoney(20);
        cardBrian.payGourmet();
        
        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);
        
        cardPekka.payEconomical();
        cardPekka.payEconomical();
        cardBrian.loadMoney(50);
        
        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);
	}
}
