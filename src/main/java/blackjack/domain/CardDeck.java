package blackjack.domain;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
    private final List<Card> cardDeck;

    public CardDeck() {
        this.cardDeck = create();
    }

    private List<Card> create() {
        List<Card> cards = new ArrayList<>();

        for (CardShape shape : CardShape.values()) {
            for (CardNumber number : CardNumber.values()) {
                cards.add(new Card(shape, number));
            }
        }

        return cards;
    }

    public int size() {
        return this.cardDeck.size();
    }
}
