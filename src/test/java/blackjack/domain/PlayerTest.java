package blackjack.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @DisplayName("Player를 생성한다.")
    @Test
    void create() {
        Player player = new Player("joy");

        assertThat(player).isEqualTo(new Player("joy"));
    }

    @DisplayName("Player가 카드를 받는다.")
    @Test
    void receive() {
        Player player = new Player("joy");
        player.receive(new Card(CardShape.DIAMOND, CardNumber.FIVE));

        assertThat(player.getCards()).containsExactly(new Card(CardShape.DIAMOND, CardNumber.FIVE));
    }

    @DisplayName("Player가 게임을 STAY한다.")
    @Test
    void stay() {
        Player player = new Player("joy");
        player.receive(new Card(CardShape.DIAMOND, CardNumber.FIVE));
        player.receive(new Card(CardShape.DIAMOND, CardNumber.J));

        player.stay();

        assertThat(player.isReceivable()).isFalse();
    }

    @DisplayName("Player가 유효하지 않은 상태에서 STAY한다.")
    @Test
    void stay_invalid() {
        Player player = new Player("joy");
        player.receive(new Card(CardShape.DIAMOND, CardNumber.FIVE));

        assertThatThrownBy(player::stay)
                .isInstanceOf(IllegalStateException.class);
    }
}
