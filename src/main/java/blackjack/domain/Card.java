package blackjack.domain;

import java.util.Objects;

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

    public int getScore() {
        return this.number.getScore();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return shape == card.shape &&
                number == card.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(shape, number);
    }

    @Override
    public String toString() {
        return String.format("%s %s", shape, number);
    }
}
