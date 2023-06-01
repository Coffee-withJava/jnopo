package br.org.soujava.coffewithjava.jnopo;

import br.org.soujava.coffewithjava.jnopo.core.GameOver;
import br.org.soujava.coffewithjava.jnopo.core.Player;

import java.time.LocalDateTime;

public record GameEvent(GameOver gameover) {

    public GameMatch toGameMatch() {
        var gameover = this.gameover();
        return new GameMatch(
                gameover.gameId(),
                gameover.playerAInfo().player().name(),
                gameover.playerAInfo().movement(),
                gameover.playerBInfo().player().name(),
                gameover.playerBInfo().movement(),
                gameover.isTied(),
                gameover.winner().map(Player::name).orElse(null),
                gameover.winnerMovement().orElse(null),
                gameover.loser().map(Player::name).orElse(null),
                gameover.loserMovement().orElse(null),
                LocalDateTime.now()
        );
    }

}
