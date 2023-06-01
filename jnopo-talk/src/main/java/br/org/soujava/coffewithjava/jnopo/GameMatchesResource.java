package br.org.soujava.coffewithjava.jnopo;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.nosql.document.DocumentTemplate;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DefaultValue;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

import java.util.List;
import java.util.stream.Stream;

@Path("/")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
@ApplicationScoped
public class GameMatchesResource {

    @Inject
    DocumentTemplate template;

    @Inject
    GameMatches gameMatches;

    @GET
    @Path("/game-matchers")
    public Stream<GameMatch> findAll() {
        return gameMatches.findAll();
    }

    @Path("/winners")
    @GET
    public List<GameMatch> findByWinnerName(@QueryParam("name") @DefaultValue("") String name) {
        System.out.println("name = " + name);
        return gameMatches.findByWinnerName(name);
    }
}
