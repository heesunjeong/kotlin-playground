package blackjack.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Players {
    private final List<Player> players;

    public Players(String names) {
        this.players = initPlayers(names);
    }

    private List<Player> initPlayers(String names) {
        validate(names);

        List<Player> players = new ArrayList<>();

        players.add(new Dealer());
        for (String name : names.split(",")) {
            players.add(new User(name));
        }

        return players;
    }

    private void validate(String names) {
        if (names.isEmpty()) {
            throw new IllegalArgumentException("블랙잭 참가자가 없습니다.");
        }
    }

    public void receive(CardDeck cardDeck) {
        for (Player player : players) {
            player.receive(cardDeck.pullOut());
        }
    }

    public List<Player> getPlayers() {
        return players;
    }

    public List<Cards> getCards() {
        return players.stream()
                .map(Player::getCards)
                .collect(Collectors.toList());
    }
}
