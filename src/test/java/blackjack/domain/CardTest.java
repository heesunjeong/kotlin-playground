package blackjack.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class CardTest {
    @Test
    void create() {
        Card card = new Card("SPADE", "a");

        assertAll(
                () -> assertEquals(card.getNumber(), CardNumber.A),
                () -> assertEquals(card.getShape(), CardShape.SPADE)
        );
    }

    @Test
    void create_invalidShape() {
        assertThatThrownBy(() -> new Card("square", "a"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("사용할 수 없는 카드 모양입니다.");
    }

    @Test
    void create_invalidNumber() {
        assertThatThrownBy(() -> new Card("club", "1"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("사용 할 수 없는 카드 숫자입니다.");
    }
}