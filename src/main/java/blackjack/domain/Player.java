package blackjack.domain;

import java.util.List;
import java.util.Objects;

public class Player implements User {
    private final String name;
    private final Cards cards;
    private boolean stay = false;

    public Player(String name) {
        this.name = name;
        this.cards = new Cards();
    }

    public void receive(Card card) {
        cards.add(card);
    }

    public List<Card> getCards() {
        return cards.getCards();
    }

    public void stay() {
        this.validateStay();
        this.stay = true;
    }

    private void validateStay() {
        if (cards.size() < 2) {
            throw new IllegalStateException("카드를 두 장 이상 가지고 있을 때 stay 할 수 있습니다.");
        }
    }

    public boolean isReceivable() {
        return !stay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
