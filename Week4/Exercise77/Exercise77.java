package test4;

public class Exercise77 {
	public static void main(String[] args) {
		LyyraCard card = new LyyraCard(50);
        System.out.println(card);
        
        card.payEconomical();
        System.out.println(card);

        card.payGourmet();
        card.payEconomical();
        System.out.println(card);
	}
}
