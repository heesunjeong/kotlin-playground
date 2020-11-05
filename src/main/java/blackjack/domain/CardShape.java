package blackjack.domain;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class CardShape {
    private static final List<String> SHAPES = Arrays.asList("SPADES", "HEARTS", "DIAMONDS", "CLUBS");

    private final String shape;

    public CardShape(String shape) {
        String cardShape = shape.toUpperCase();

        this.validate(cardShape);
        this.shape = cardShape;
    }

    private void validate(String shape) {
        if (!SHAPES.contains(shape)) {
            throw new IllegalArgumentException("사용할 수 없는 카드 모양입니다.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CardShape cardShape = (CardShape) o;
        return Objects.equals(shape, cardShape.shape);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shape);
    }

    @Override
    public String toString() {
        return shape;
    }
}
