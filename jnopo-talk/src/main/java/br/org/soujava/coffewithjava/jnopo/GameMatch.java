package br.org.soujava.coffewithjava.jnopo;

import br.org.soujava.coffewithjava.jnopo.core.Movement;
import jakarta.nosql.Column;
import jakarta.nosql.Entity;
import jakarta.nosql.Id;

import java.util.Objects;

@Entity
public class GameMatch {

    @Id
    private String id;
    @Column
    private String playerAName;
    @Column
    private Movement playerAMovement;
    @Column
    private String playerBName;
    @Column
    private Movement playerBMovement;
    @Column
    private String winnerName;
    @Column
    private Movement winnerMovement;
    @Column
    private String loserName;
    @Column
    private Movement loserMovement;
    @Column
    private boolean tied;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlayerAName() {
        return playerAName;
    }

    public void setPlayerAName(String playerAName) {
        this.playerAName = playerAName;
    }

    public Movement getPlayerAMovement() {
        return playerAMovement;
    }

    public void setPlayerAMovement(Movement playerAMovement) {
        this.playerAMovement = playerAMovement;
    }

    public String getPlayerBName() {
        return playerBName;
    }

    public void setPlayerBName(String playerBName) {
        this.playerBName = playerBName;
    }

    public Movement getPlayerBMovement() {
        return playerBMovement;
    }

    public void setPlayerBMovement(Movement playerBMovement) {
        this.playerBMovement = playerBMovement;
    }

    public String getWinnerName() {
        return winnerName;
    }

    public void setWinnerName(String winnerName) {
        this.winnerName = winnerName;
    }

    public Movement getWinnerMovement() {
        return winnerMovement;
    }

    public void setWinnerMovement(Movement winnerMovement) {
        this.winnerMovement = winnerMovement;
    }

    public String getLoserName() {
        return loserName;
    }

    public void setLoserName(String loserName) {
        this.loserName = loserName;
    }

    public Movement getLoserMovement() {
        return loserMovement;
    }

    public void setLoserMovement(Movement loserMovement) {
        this.loserMovement = loserMovement;
    }

    public boolean isTied() {
        return tied;
    }

    public void setTied(boolean tied) {
        this.tied = tied;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameMatch gameMatch = (GameMatch) o;
        return tied == gameMatch.tied && Objects.equals(id, gameMatch.id) && Objects.equals(playerAName, gameMatch.playerAName) && playerAMovement == gameMatch.playerAMovement && Objects.equals(playerBName, gameMatch.playerBName) && playerBMovement == gameMatch.playerBMovement && Objects.equals(winnerName, gameMatch.winnerName) && winnerMovement == gameMatch.winnerMovement && Objects.equals(loserName, gameMatch.loserName) && loserMovement == gameMatch.loserMovement;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, playerAName, playerAMovement, playerBName, playerBMovement, winnerName, winnerMovement, loserName, loserMovement, tied);
    }
}
