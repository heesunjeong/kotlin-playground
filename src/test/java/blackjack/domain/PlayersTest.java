package blackjack.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class PlayersTest {

    @Test
    void create() {
        Players players = new Players("joy");

        assertThat(players.getPlayers().size()).isEqualTo(2);
        assertThat(players.getPlayers()).contains(new User("joy"));
    }

    @Test
    void create_invalid() {
        assertThatThrownBy(() -> new Players(""))
                .isInstanceOf(IllegalArgumentException.class);
    }


}
