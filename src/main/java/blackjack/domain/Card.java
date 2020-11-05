package blackjack.domain;

public class Card {
    private final CardShape shape;
    private final CardNumber number;

    public Card(String shape, String number) {
        this.shape = CardShape.of(shape);
        this.number = CardNumber.of(number);
    }

    public Card(CardShape shape, CardNumber number) {
        this.shape = shape;
        this.number = number;
    }

    public CardShape getShape() {
        return shape;
    }

    public CardNumber getNumber() {
        return number;
    }
}
