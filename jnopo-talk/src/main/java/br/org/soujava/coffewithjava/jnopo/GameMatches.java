package br.org.soujava.coffewithjava.jnopo;

import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Param;
import jakarta.data.repository.Query;
import jakarta.data.repository.Repository;

import java.util.List;

@Repository
public interface GameMatches extends CrudRepository<GameMatch,String> {

    public List<GameMatch> findByWinnerName(String name);

}
