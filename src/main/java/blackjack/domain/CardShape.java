package blackjack.domain;

import java.util.Arrays;

public enum CardShape {
    SPADE,
    HEART,
    DIAMOND,
    CLUB;

    public static CardShape of(String shape) {
        return Arrays.stream(values())
                .filter(it -> shape.equalsIgnoreCase(it.toString()))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("사용할 수 없는 카드 모양입니다."));
    }
}
