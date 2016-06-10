package test12;

enum Cards {
	CLUB, SPADE, DIAMOND, HEARTS
};

class CardsEnumTest {
	public static void main(String[] args) {
	 for(Cards card : Cards.values())
		 System.out.print(card + " ");
	}
}
