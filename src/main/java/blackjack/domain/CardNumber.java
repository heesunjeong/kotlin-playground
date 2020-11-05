package blackjack.domain;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class CardNumber {
    private static final List<String> NUMBERS = Arrays.asList("A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "K", "Q");

    private final String number;

    public CardNumber(String number) {
        String cardNumber = number.toUpperCase();
        this.validate(cardNumber);
        this.number = cardNumber;
    }

    private void validate(String number) {
        if(!NUMBERS.contains(number)) {
            throw new IllegalArgumentException("사용 할 수 없는 카드 숫자입니다.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CardNumber that = (CardNumber) o;
        return Objects.equals(number, that.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return number;
    }
}
