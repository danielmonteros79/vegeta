package edu.it.entities;

import javax.persistence.*;

@Entity
@Table(name="usuarios")
public class Usuario {
    @Id
    public String id;
    public String nombre;
    public String apellido;
    public String domicilio;
    public String pais;
    @Column(name="tipo_de_usuario")
    public TipoDeUsuario tipoDeUsuario;

    public Usuario(String id, String nombre, String apellido, String domicilio, String pais, TipoDeUsuario tipoDeUsuario) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.pais = pais;
        this.tipoDeUsuario = tipoDeUsuario;
    }

    public Usuario() {
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", domicilio=" + domicilio + ", pais=" + pais + ", tipoDeUsuario=" + tipoDeUsuario + '}';
    }

    
}
