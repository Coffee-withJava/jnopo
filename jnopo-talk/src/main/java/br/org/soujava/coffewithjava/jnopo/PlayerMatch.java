package br.org.soujava.coffewithjava.jnopo;

import br.org.soujava.coffewithjava.jnopo.core.Movement;
import jakarta.nosql.Column;
import jakarta.nosql.Entity;

import java.util.Objects;

@Entity
public final class PlayerMatch {

    @Column
    private String name;

    @Column
    private Movement movement;

    public PlayerMatch() {
    }

    public PlayerMatch(String name, Movement movement) {
        this.name = name;
        this.movement = movement;
    }

    public String getName() {
        return name;
    }

    public Movement getMovement() {
        return movement;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (PlayerMatch) obj;
        return Objects.equals(this.name, that.name) &&
                Objects.equals(this.movement, that.movement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, movement);
    }

    @Override
    public String toString() {
        return "PlayerMatch[" +
                "name=" + name + ", " +
                "movement=" + movement + ']';
    }

}
