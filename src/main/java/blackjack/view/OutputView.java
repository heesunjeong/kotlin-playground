package blackjack.view;

import blackjack.domain.Player;

import java.util.List;

public class OutputView {

    private OutputView() {
    }

    public static void printHello() {
        System.out.println("블랙잭 게임을 시작합니다. 🃏");
    }

    public static void printPullOutCard(String players, List<Player> gamePlayers) {
        System.out.println(String.format("딜러와 %s에게 카드를 두장씩 나누었습니다.", players));
        for (Player gamePlayer : gamePlayers) {
            System.out.println(String.format("%s: %s", gamePlayer.getName(), gamePlayer.getCards()));
        }
    }
}
