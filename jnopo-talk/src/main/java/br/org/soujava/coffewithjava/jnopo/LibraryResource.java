package br.org.soujava.coffewithjava.jnopo;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/library")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON})
@ApplicationScoped
public class LibraryResource {

    @Inject
    LibraryRepo repo;

    @GET
    public List<Library> listAll(){
        return repo.findAll().toList();
    }

    @Path("by-name")
    @GET
    public List<Library> findByName(@QueryParam("name") String name){
        return repo.findByNameLike(name).toList();
    }

    @Path("by-book")
    @GET
    public List<Library> findByBookName(@QueryParam("name") String name){
        return repo.findByBookNameLike(name).toList();
    }

    @POST
    public Library add(Library library) {
        return repo.save(library);
    }

    @Path("{id}")
    @DELETE
    public void delete(@PathParam("id") String id) {
        repo.deleteById(id);
    }

}
