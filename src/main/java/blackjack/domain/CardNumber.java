package blackjack.domain;

import java.util.Arrays;

public enum CardNumber {
    A("A", 1),
    TWO("2", 2),
    THREE("3", 3),
    FOUR("4", 4),
    FIVE("5", 5),
    SIX("6", 6),
    SEVEN("7", 7),
    EIGHT("8", 8),
    NINE("9", 9),
    TEN("10", 10),
    J("J", 10),
    K("K", 10),
    Q("Q", 10);

    private final String number;
    private final int score;

    CardNumber(String number, int score) {
        this.number = number;
        this.score = score;
    }

    public static CardNumber of(String number) {
        return Arrays.stream(values())
                .filter(it -> number.equalsIgnoreCase(it.number))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("사용 할 수 없는 카드 숫자입니다."));
    }

    @Override
    public String toString() {
        return number;
    }
}
