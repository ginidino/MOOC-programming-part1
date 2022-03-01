package WEEK4;

// Exercise 77.4: Loading money to card
public class Exercise774 {
	public static void main(String[] args) {
		LyyraCard card = new LyyraCard(10);
        System.out.println(card);

        card.loadMoney(15);
        System.out.println(card);

        card.loadMoney(10);
        System.out.println(card);

        card.loadMoney(200);
        System.out.println(card);
	}
}
