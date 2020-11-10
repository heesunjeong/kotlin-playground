package blackjack.domain;

import blackjack.domain.Player;

import java.util.ArrayList;
import java.util.List;

public class BlackjackGame {
    private final CardDeck cardDeck;
    private final List<Player> players;

    public BlackjackGame(String names) {
        this.cardDeck = new CardDeck();
        this.players = new ArrayList<>();

        for (String name : names.split(",")) {
            players.add(new Player(name));
        }
    }

    public  List<Player> getPlayers() {
        return players;
    }
}
