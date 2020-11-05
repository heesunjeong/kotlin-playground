package blackjack.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class CardShapeTest {
    @Test
    void create() {
        CardShape cardShape = CardShape.of("heart");

        assertThat(cardShape).isEqualTo(CardShape.HEART);
    }

    @Test
    void create_invalid() {
        assertThatThrownBy(() -> CardShape.of("square"))
                .isInstanceOf(IllegalArgumentException.class);
    }
}