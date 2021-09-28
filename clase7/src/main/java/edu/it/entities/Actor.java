package edu.it.entities;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name="actores")
public class Actor {
    @Id
    public String id;
    public String nombre;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="actor_pelicula",
            joinColumns = @JoinColumn(name="actor_id"),
            inverseJoinColumns = @JoinColumn(name="pelicula_id"))
    public List<Pelicula> peliculas;

    public Actor(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.peliculas = new ArrayList<Pelicula>();
    }

    public Actor() {
    }


}
