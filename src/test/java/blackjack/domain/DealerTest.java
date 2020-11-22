package blackjack.domain;

import com.sun.tools.javac.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class DealerTest {

    @DisplayName("Dealer가 카드를 받는다")
    @Test
    void receive() {
        Dealer dealer = new Dealer();
        dealer.receive(new Card(CardShape.DIAMOND, CardNumber.FIVE));

        assertThat(dealer.getCards().getCards()).containsExactly(new Card(CardShape.DIAMOND, CardNumber.FIVE));
    }

    @DisplayName("Dealer가 17이 될때까지 카드를 받을 수 있다")
    @Test
    void receivable_lessThan17() {
        Dealer dealer = new Dealer();
        dealer.receive(new Card(CardShape.DIAMOND, CardNumber.FIVE));
        dealer.receive(new Card(CardShape.HEART, CardNumber.TEN));

        assertThat(dealer.isReceivable()).isTrue();
    }

    @DisplayName("Dealer가 17이상인 경우 카드를 받을 수 없다")
    @Test
    void receivable_over17() {
        Dealer dealer = new Dealer();
        dealer.receive(new Card(CardShape.DIAMOND, CardNumber.FIVE));
        dealer.receive(new Card(CardShape.HEART, CardNumber.TEN));
        dealer.receive(new Card(CardShape.SPADE, CardNumber.TWO));

        assertThat(dealer.isReceivable()).isFalse();
    }

}
