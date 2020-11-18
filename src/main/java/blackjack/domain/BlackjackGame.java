package blackjack.domain;

import java.util.List;

public class BlackjackGame {
    private final CardDeck cardDeck;
    private final Players players;

    public BlackjackGame(String names) {
        this.cardDeck = new CardDeck();
        this.players = new Players(names);
    }

    public  List<Player> getPlayers() {
        return players.getPlayers();
    }
}
