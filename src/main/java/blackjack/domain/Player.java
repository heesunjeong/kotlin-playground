package blackjack.domain;

import java.util.List;

public interface Player {
    void receive(Card card);

    boolean isReceivable();

    void stay();

    List<Card> getCards();
}
