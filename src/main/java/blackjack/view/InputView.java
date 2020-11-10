package blackjack.view;

import java.util.Scanner;

public class InputView {
    private static final Scanner sc = new Scanner(System.in);

    private InputView() {
    }

    public static String inputPlayers() {
        System.out.println("게임에 참여할 Player의 이름을 입력하세요. (,기준으로 분리)");
        return sc.nextLine();
    }
}
