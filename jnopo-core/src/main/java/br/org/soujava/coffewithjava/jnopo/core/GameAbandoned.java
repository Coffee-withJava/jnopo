package br.org.soujava.coffewithjava.jnopo.core;

import java.util.Set;

public record GameAbandoned(String gameId, Set<Player> players) implements GameState {
}
