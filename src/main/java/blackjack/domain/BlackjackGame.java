package blackjack.domain;

import java.util.List;

public class BlackjackGame {
    private final CardDeck cardDeck;
    private final Players players;

    public BlackjackGame(String names) {
        this.cardDeck = new CardDeck();
        this.players = new Players(names);

        this.playFirstTurn();
    }

    private void playFirstTurn() {
        for (int i = 0; i < 2; i++) {
            this.playTurn();
        }
    }

    public void playTurn() {
        players.receive(cardDeck);
    }

    public List<Player> getPlayers() {
        return players.getPlayers();
    }

    public List<Cards> getCards() {
        return players.getCards();
    }
}
