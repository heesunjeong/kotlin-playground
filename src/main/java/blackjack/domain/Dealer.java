package blackjack.domain;

import java.util.List;

public class Dealer implements Player {

    private static final int MAX_SCORE = 17;
    public static final String NAME = "딜러";

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
    public Cards getCards() {
        return cards;
    }

    @Override
    public String getName() {
        return NAME;
    }
}
