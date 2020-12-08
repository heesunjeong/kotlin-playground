package blackjack;

import blackjack.domain.BlackjackGame;
import blackjack.view.InputView;
import blackjack.view.OutputView;

public class BlackjackMain {
    public static void main(String[] args) {
        OutputView.printHello();
        String players = InputView.inputPlayers();

        BlackjackGame game = new BlackjackGame(players);
        OutputView.printPullOutCard(players, game.getPlayers());
    }
}
