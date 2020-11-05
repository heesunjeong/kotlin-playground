package blackjack.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CardNumberTest {
    @Test
    void create() {
        CardNumber number = new CardNumber("a");

        assertThat(number).hasToString("A");
    }

    @Test
    void create2() {
        CardNumber number = new CardNumber("10");

        assertThat(number).hasToString("10");
    }
}