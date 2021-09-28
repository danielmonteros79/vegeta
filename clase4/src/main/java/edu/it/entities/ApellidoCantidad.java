package edu.it.entities;

public class ApellidoCantidad {
    public final String apellido;
    public final String cantidad;

    public ApellidoCantidad(Object[] objArr) {
        apellido = objArr[0].toString();
        cantidad = objArr[1].toString();
    }
}
