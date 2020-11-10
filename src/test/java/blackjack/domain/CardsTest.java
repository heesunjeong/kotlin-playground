package blackjack.domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CardsTest {
    @Test
    void create() {
        Cards cards = new Cards(Arrays.asList(new Card(CardShape.HEART, CardNumber.A), new Card(CardShape.CLUB, CardNumber.EIGHT)));
        assertThat(cards.size()).isEqualTo(2);
    }

    @Test
    void add() {
        Cards cards = new Cards();
        cards.add(new Card(CardShape.HEART, CardNumber.A));
        cards.add(new Card(CardShape.CLUB, CardNumber.EIGHT));

        assertThat(cards.size()).isEqualTo(2);
    }

    @Test
    void add_invalid() {
        Cards cards = new Cards();
        cards.add(new Card(CardShape.HEART, CardNumber.A));

        assertThatThrownBy(() -> cards.add(new Card(CardShape.HEART, CardNumber.A)))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
