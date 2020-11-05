package blackjack.domain;

public class Card {
    private final CardShape shape;
    private final CardNumber number;

    public Card(String shape, String number) {
        this.shape = new CardShape(shape);
        this.number = new CardNumber(number);
    }

    public CardShape getShape() {
        return shape;
    }

    public CardNumber getNumber() {
        return number;
    }
}
