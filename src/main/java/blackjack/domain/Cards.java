package blackjack.domain;

import java.util.ArrayList;
import java.util.List;

public class Cards {

    private final List<Card> cards;

    public Cards() {
        this.cards = new ArrayList();
    }

    public Cards(List<Card> cards) {
        this.cards = cards;
    }

    public void add(Card card) {
        this.validate(card);
        cards.add(card);
    }

    private void validate(Card card) {
        if(cards.contains(card) ) {
            throw new IllegalArgumentException("카드는 중복으로 있을 수 없습니다.");
        }
    }

    public int size() {
        return cards.size();
    }
}
