package blackjack.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardDeck {
    public static final int ALL_CARDS_COUNT = 52;

    private final List<Card> cardDeck;

    public CardDeck() {
        this.cardDeck = create();
        Collections.shuffle(cardDeck);
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

    public Card pullOut() {
        if(cardDeck.isEmpty()) {
            throw new IllegalStateException("");
        }

        Card card = cardDeck.get(0);
        cardDeck.remove(card);
        return card;
    }

    public int size() {
        return this.cardDeck.size();
    }

    public boolean isFull() {
        return this.cardDeck.size() == ALL_CARDS_COUNT;
    }
}
