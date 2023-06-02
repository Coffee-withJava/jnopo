package br.org.soujava.coffewithjava.jnopo;

import br.org.soujava.coffewithjava.jnopo.core.Movement;
import jakarta.inject.Inject;
import jakarta.nosql.document.DocumentTemplate;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/playoffs")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
public class PlayoffsResources {

    @Inject
    Playoffs playoffs;

    @Inject
    DocumentTemplate template;

    @GET
    public List<GameMatch> listAll(){
        return playoffs.findAll().toList();
    }

    @Path("winner")
    @GET
    public List<Object> list2(@QueryParam("name") String name){

        return template.select(GameMatch.class).where("winnerName").like(name)
                .result();
    }

    @Path("tied")
    @GET
    public List<GameMatch> tiedMatchs(){
        return playoffs.findByTied(true);
    }

    @Path("winnerMovement")
    @GET
    public List<GameMatch> findByWinnerMovement(@QueryParam("movement") Movement movement){
        return playoffs.findByMovement(movement);
    }


}
