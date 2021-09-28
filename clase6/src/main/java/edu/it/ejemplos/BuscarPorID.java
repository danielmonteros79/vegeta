package edu.it.ejemplos;

import edu.it.components.ConectorJPA;
import edu.it.entities.Usuario;

public class BuscarPorID implements Runnable {
    public void run() {
        var conn = new ConectorJPA();
        var em = conn.getEntityManager();

        Usuario u = em.find(Usuario.class, "013900e4-9bbd-49fd-882d-e3b8e4822ebb");

        if (u != null) {
            System.out.println(u);
        }
    }
}
