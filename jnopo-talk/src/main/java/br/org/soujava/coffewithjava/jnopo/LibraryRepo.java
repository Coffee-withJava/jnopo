package br.org.soujava.coffewithjava.jnopo;

import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Param;
import jakarta.data.repository.Query;
import jakarta.data.repository.Repository;

import java.util.stream.Stream;

@Repository
public interface LibraryRepo extends CrudRepository<Library, String> {

    @Query("select * from Library where name = @name")
    Stream<Library> findByNameLike(@Param("name") String name);

    Stream<Library> findByBookNameLike(String name);
}
