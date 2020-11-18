package blackjack.domain;

import java.util.ArrayList;
import java.util.List;

public class Players {
    private final List<Player> players;

    public Players(String names) {
        List<Player> players = new ArrayList<>();

        for (String name : names.split(",")) {
            players.add(new User(name));
        }
        players.add(new Dealer());

        this.players = players;
    }

}
