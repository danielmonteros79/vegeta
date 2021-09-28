package edu.it.ejemplos;

import edu.it.components.ConectorJPA;
import edu.it.entities.Director;
import edu.it.entities.Pelicula;
import edu.it.utiles.Util;

public class UnoAMuchosEjemplo2 implements Runnable {
    public void run() {
        var conn = new ConectorJPA();
        var em = conn.getEntityManager();

        var tq = em.createQuery("SELECT d FROM Director d", Director.class);
        for (Director d : tq.getResultList()) {
            System.out.println("************* DIRECTOR *************");
            System.out.println(d.nombre);
            System.out.println("************************************");
            Util.esperar(5);
            if (d.id.equals("200000003") == false) {
                continue;
            }
            for (Pelicula p : d.peliculas) {
                System.out.println(p);
            }
        }
    }
}
