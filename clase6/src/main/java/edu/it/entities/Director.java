package edu.it.entities;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name="directores")
public class Director {
    @Id
    public String id;
    public String nombre;

    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    @JoinColumn(name="director_id") // Foreing Key
    public List<Pelicula> peliculas;

    public void agregarPelicula(Pelicula p) {
        this.peliculas.add(p);
        p.director = this;
    }

    public Director(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        peliculas = new ArrayList<>();
    }

    public Director() {
        peliculas = new ArrayList<>();
    }
}
