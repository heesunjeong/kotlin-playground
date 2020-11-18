package blackjack.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class BlackjackGameTest {

    @Test
    void create() {
        BlackjackGame blackjackGame = new BlackjackGame("joy,dave");

        assertThat(blackjackGame.getPlayers().size()).isEqualTo(3);
        assertThat(blackjackGame.getPlayers()).contains(new User("joy"), new User("dave"));
    }
}
