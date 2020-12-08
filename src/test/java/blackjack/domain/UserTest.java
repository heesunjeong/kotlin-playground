package blackjack.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class UserTest {

    @DisplayName("User를 생성한다.")
    @Test
    void create() {
        User user = new User("joy");

        assertThat(user).isEqualTo(new User("joy"));
    }

    @DisplayName("User가 카드를 받는다.")
    @Test
    void receive() {
        User user = new User("joy");
        user.receive(new Card(CardShape.DIAMOND, CardNumber.FIVE));

        assertThat(user.getCards().getCards()).containsExactly(new Card(CardShape.DIAMOND, CardNumber.FIVE));
    }

    @DisplayName("User가 게임을 STAY한다.")
    @Test
    void stay() {
        User user = new User("joy");
        user.receive(new Card(CardShape.DIAMOND, CardNumber.FIVE));
        user.receive(new Card(CardShape.DIAMOND, CardNumber.J));

        user.stay();

        assertThat(user.isReceivable()).isFalse();
    }

    @DisplayName("User가 유효하지 않은 상태에서 STAY한다.")
    @Test
    void stay_invalid() {
        User user = new User("joy");
        user.receive(new Card(CardShape.DIAMOND, CardNumber.FIVE));

        assertThatThrownBy(user::stay)
                .isInstanceOf(IllegalStateException.class);
    }

    @DisplayName("User가 받은 카드를 보여준다.")
    @Test
    void displayCard() {
        User user = new User("joy");
        user.receive(new Card(CardShape.DIAMOND, CardNumber.FIVE));
        user.receive(new Card(CardShape.DIAMOND, CardNumber.SEVEN));

        assertThat(user.displayCard())
                .hasSize(2)
                .containsExactly(new Card(CardShape.DIAMOND, CardNumber.FIVE), new Card(CardShape.DIAMOND, CardNumber.SEVEN));
    }
}
