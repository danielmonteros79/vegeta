package edu.it.ejemplos;

import edu.it.entities.Actor;
import edu.it.entities.Pelicula;
import edu.it.repository.ActorRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import javax.transaction.Transactional;
import org.springframework.stereotype.Component;

@Component
public class InsertarActor implements Runnable {

    @Autowired
    ActorRepository actorRepo;

    @Transactional
    public void run() {
        Optional<Actor> optActor = actorRepo.findById("300000001");

        if (optActor.isEmpty()) {
            System.out.println("El actor no fue encontrado");
            return;
        }

        Actor jb = optActor.get();

        System.out.println(jb.nombre);
        for (Pelicula p : jb.peliculas) {
            System.out.println(p.nombre);
            System.out.println(p.genero);
            System.out.println("Datos del direcor");
            System.out.println(p.director.nombre);
        }

        jb.peliculas.get(0).nombre = "El pais de las maravillas";

        actorRepo.save(jb);

        /*
        Actor javierBardem = new Actor("300000001", "Javier Bardem");
        Director ethanCohen = new Director("200000005", "Hermanos Cohen");

        Pelicula noCountryForOldMen = new Pelicula("100000008", "No Country for Old Men", "Suspenso", ethanCohen);
        javierBardem.peliculas.add(noCountryForOldMen);

        javierBardem.nombre = "Javi Bardem";
        actorRepo.save(javierBardem);
        */
    }
}
