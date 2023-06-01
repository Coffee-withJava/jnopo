package br.org.soujava.coffewithjava.jnopo;

import br.org.soujava.coffewithjava.jnopo.core.Movement;
import jakarta.nosql.Column;
import jakarta.nosql.Entity;
import jakarta.nosql.Id;

import java.time.LocalDateTime;
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
    private boolean isTied;
    @Column
    private String winnerName;
    @Column
    private Movement winnerMovement;
    @Column
    private String loserName;
    @Column
    private Movement loserMovement;
    @Column
    private LocalDateTime occurredOn;

    public GameMatch() {
    }

    public GameMatch(
            @Id String id,
            @Column String playerAName,
            @Column Movement playerAMovement,
            @Column String playerBName,
            @Column Movement playerBMovement,
            @Column boolean isTied,
            @Column String winnerName,
            @Column Movement winnerMovement,
            @Column String loserName,
            @Column Movement loserMovement,
            @Column LocalDateTime occurredOn) {
        this.id = id;
        this.playerAName = playerAName;
        this.playerAMovement = playerAMovement;
        this.playerBName = playerBName;
        this.playerBMovement = playerBMovement;
        this.isTied = isTied;
        this.winnerName = winnerName;
        this.winnerMovement = winnerMovement;
        this.loserName = loserName;
        this.loserMovement = loserMovement;
        this.occurredOn = occurredOn;
    }

    public String getId() {
        return id;
    }

    public String getPlayerAName() {
        return playerAName;
    }

    public Movement getPlayerAMovement() {
        return playerAMovement;
    }

    public String getPlayerBName() {
        return playerBName;
    }

    public Movement getPlayerBMovement() {
        return playerBMovement;
    }

    public boolean isTied() {
        return isTied;
    }

    public String getWinnerName() {
        return winnerName;
    }

    public Movement getWinnerMovement() {
        return winnerMovement;
    }

    public String getLoserName() {
        return loserName;
    }

    public Movement getLoserMovement() {
        return loserMovement;
    }

    public LocalDateTime getOccurredOn() {
        return occurredOn;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (GameMatch) obj;
        return Objects.equals(this.id, that.id) &&
                Objects.equals(this.playerAName, that.playerAName) &&
                Objects.equals(this.playerAMovement, that.playerAMovement) &&
                Objects.equals(this.playerBName, that.playerBName) &&
                Objects.equals(this.playerBMovement, that.playerBMovement) &&
                this.isTied == that.isTied &&
                Objects.equals(this.winnerName, that.winnerName) &&
                Objects.equals(this.winnerMovement, that.winnerMovement) &&
                Objects.equals(this.loserName, that.loserName) &&
                Objects.equals(this.loserMovement, that.loserMovement) &&
                Objects.equals(this.occurredOn, that.occurredOn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, playerAName, playerAMovement, playerBName, playerBMovement, isTied, winnerName, winnerMovement, loserName, loserMovement, occurredOn);
    }

    @Override
    public String toString() {
        return "GameMatch[" +
                "id=" + id + ", " +
                "playerAName=" + playerAName + ", " +
                "playerAMovement=" + playerAMovement + ", " +
                "playerBName=" + playerBName + ", " +
                "playerBMovement=" + playerBMovement + ", " +
                "isTied=" + isTied + ", " +
                "winnerName=" + winnerName + ", " +
                "winnerMovement=" + winnerMovement + ", " +
                "loserName=" + loserName + ", " +
                "loserMovement=" + loserMovement + ", " +
                "occurredOn=" + occurredOn + ']';
    }
}