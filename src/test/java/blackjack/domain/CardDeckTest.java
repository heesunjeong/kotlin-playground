package blackjack.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CardDeckTest {
    @Test
    void create() {
        CardDeck cardDeck = new CardDeck();

        assertThat(cardDeck.size()).isEqualTo(52);
    }

    @Test
    void pullOut() {
        CardDeck cardDeck = new CardDeck();

        Card card = cardDeck.pullOut();

        assertAll(
                () -> assertThat(card).isInstanceOf(Card.class),
                () -> assertThat(cardDeck.size()).isEqualTo(51)
        );
    }
}
