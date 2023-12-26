package ch06;

public class CardTest {
    public static void main(String[] args) {
        System.out.println("Card.width= "+ Card.width);
        System.out.println("Card.height= "+ Card.height);

        Card c1 = new Card();
        c1.kind ="Heart";
        c1.number=7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;


    }
}
