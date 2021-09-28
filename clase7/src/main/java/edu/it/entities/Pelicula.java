package edu.it.entities;

import javax.persistence.*;

@Entity
@Table(name="peliculas")
public class Pelicula {
    @Id
    public String id;
    public String nombre;
    public String genero;

    @ManyToOne(cascade = CascadeType.ALL)
    public Director director;

    //@ManyToMany(mappedBy = "peliculas")
    //public List<Actor> actores;

    public void asignarDirector(Director d) {
        this.director = d;
        this.director.peliculas.add(this);
    }

    public Pelicula(String id, String nombre, String genero, Director director) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.director = director;
        this.director.peliculas.add(this);
    }

    public Pelicula() {
        this.id = id;
    }



    @Override
    public String toString() {
        return "Pelicula{" + "id=" + id + ", nombre=" + nombre + ", genero=" + genero + ", director=" + director.nombre + '}';
    }

}
