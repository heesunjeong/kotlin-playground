package blackjack.domain;

import java.util.ArrayList;
import java.util.List;

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

    public List<Player> getPlayers() {
        return players;
    }
}
