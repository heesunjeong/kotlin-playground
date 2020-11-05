package blackjack.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class CardShapeTest {
    @Test
    void create() {
        CardShape cardShape = new CardShape("hearts");

        assertThat(cardShape).hasToString("HEARTS");
    }

    @Test
    void create_invalid() {
        assertThatThrownBy(() -> new CardShape("SQUARES"))
                .isInstanceOf(IllegalArgumentException.class);
    }
}