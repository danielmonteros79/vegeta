package edu.it;

public class Chofer {
    public String nombre;
    public Boolean leGustaSuTrabajo;
    public Integer cantidadDeAccidentes;

    public Chofer(String nombre, Boolean leGustaSuTrabajo, Integer cantidadDeAccidentes) {
        this.nombre = nombre;
        this.leGustaSuTrabajo = leGustaSuTrabajo;
        this.cantidadDeAccidentes = cantidadDeAccidentes;
    }

    public String toString() {
        return "Chofer{" + "nombre=" + nombre + ", leGustaSuTrabajo=" + leGustaSuTrabajo + ", cantidadDeAccidentes=" + cantidadDeAccidentes + '}';
    }
}
