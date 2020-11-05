package blackjack.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class CardNumberTest {
    @Test
    void create() {
        CardNumber number = CardNumber.of("a");

        assertThat(number).isEqualTo(CardNumber.A);
    }

    @Test
    void create2() {
        CardNumber number = CardNumber.of("10");

        assertThat(number).isEqualTo(CardNumber.TEN);
    }

    @Test
    void create_invalid() {
        assertThatThrownBy(() -> CardNumber.of("11"))
                .isInstanceOf(IllegalArgumentException.class);
    }
}