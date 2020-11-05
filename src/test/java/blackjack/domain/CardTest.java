package blackjack.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class CardTest {
    @Test
    void create() {
        Card card = new Card("SPADES", "a");

        assertAll(
                () -> assertEquals(card.getNumber(), new CardNumber("A")),
                () -> assertEquals(card.getShape(), new CardShape("SPADES"))
        );
    }

    @Test
    void create_invalidShape() {
        assertThatThrownBy(() -> new Card("squares", "a"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("사용할 수 없는 카드 모양입니다.");
    }

    @Test
    void create_invalidNumber() {
        assertThatThrownBy(() -> new Card("clubs", "1"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("사용 할 수 없는 카드 숫자입니다.");
    }
}