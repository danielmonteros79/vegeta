package edu.it.ejemplos;

import edu.it.components.ConectorJPA;
import edu.it.entities.TipoDeUsuario;
import edu.it.entities.Usuario;

class SL {
    String str;
    Integer largo;

    public SL(String str, Integer largo) {
        this.str = str;
        this.largo = largo;
    }

    public String toString() {
        return "SL{" + "str=" + str + ", largo=" + largo + '}';
    }
}

public class EjemploUsandoStreams implements Runnable {
    public void run() {
        var conn = new ConectorJPA();
        var em = conn.getEntityManager();

        var tq = em.createQuery("SELECT u FROM Usuario u", Usuario.class);
        tq.getResultStream()
                .filter(e -> e.apellido.startsWith("G"))
                .filter(e -> e.nombre.startsWith("A"))
                .filter(e -> e.tipoDeUsuario == TipoDeUsuario.USUARIO_ESTANDAR)
                .map(u -> {
                    String s = "u.id + \" - \" + u.nombre + \" - \" + u.apellido";
                    return new SL(s,s.length());
                })
                .limit(2)
                .forEach(z -> {
                    System.out.println("***************************");
                    System.out.println(z);
                    System.out.println("***************************");
                });
    }
}
