package WEEK4;

public class Exercise77 {
	public static void main(String[] args) {
		// 77.1
		LyyraCard card = new LyyraCard(50);
        System.out.println(card);
        
        // 77.2: Paying with card
        card.payEconomical();
        System.out.println(card);

        card.payGourmet();
        card.payEconomical();
        System.out.println(card);
	}
}
