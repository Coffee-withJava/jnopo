package br.org.soujava.coffewithjava.jnopo;

import br.org.soujava.coffewithjava.jnopo.core.Movement;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Param;
import jakarta.data.repository.Query;
import jakarta.data.repository.Repository;

import java.util.List;

@Repository
public interface Playoffs extends CrudRepository<GameMatch, String> {

    List<GameMatch> findByTied(boolean tied);

    @Query("select * from GameMatch where winnerMovement = @movement")
    List<GameMatch> findByMovement(@Param("movement") Movement movement);

}
