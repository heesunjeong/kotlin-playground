package blackjack.domain;

import java.util.List;

public class Dealer implements User {

    private static final int MAX_SCORE = 17;

    private final Cards cards;

    public Dealer() {
        this.cards = new Cards();
    }

    @Override
    public void receive(Card card) {
        cards.add(card);
    }

    @Override
    public boolean isReceivable() {
        return cards.sumTotalScore() < MAX_SCORE;
    }

    @Override
    public void stay() {
    }

    @Override
    public List<Card> getCards() {
        return cards.getCards();
    }
}
