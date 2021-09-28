package edu.it.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.it.entities.Pelicula;

@Repository
public interface PeliculaRepository extends JpaRepository<Pelicula, String> {
	List<Pelicula> findAllByGenero(String genero);
	List<Pelicula> findTop2ByGeneroOrderByNombre(String genero);
	List<Pelicula> findTop20ByGeneroOrderByNombreDesc(String genero);
}
