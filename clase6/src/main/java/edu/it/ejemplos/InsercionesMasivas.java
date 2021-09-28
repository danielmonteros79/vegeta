package edu.it.ejemplos;

import edu.it.components.ConectorJPA;
import static edu.it.utiles.Util.inventarUsuario;

public class InsercionesMasivas implements Runnable {
    public void run() {
        var conn = new ConectorJPA();
        var em = conn.getEntityManager();

        var tx = em.getTransaction();
        tx.begin();
        for (int x : new int[1000]) {
            em.persist(inventarUsuario());
        }
        tx.commit();

        em.close();
    }

}
