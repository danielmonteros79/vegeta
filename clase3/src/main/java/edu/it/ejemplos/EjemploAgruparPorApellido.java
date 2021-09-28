package edu.it.ejemplos;

import edu.it.components.ConectorJPA;
import edu.it.entities.ApellidoCantidad;
import java.util.List;

public class EjemploAgruparPorApellido implements Runnable {
    public void run() {
        var conn = new ConectorJPA();
        var em = conn.getEntityManager();

        var JPQL = new StringBuilder()
                .append("SELECT u.apellido, count(*) ")
                .append("FROM Usuario u ")
                .append("GROUP BY u.apellido ")
                .append("HAVING count(*) > 4")
                .toString();

        var queryNoTipado = em.createQuery(JPQL);
        List<Object[]> lst = queryNoTipado.getResultList();

        for (Object[] arrObj : lst) {
            var apeCant = new ApellidoCantidad(arrObj);
            System.out.print(apeCant.apellido);
            System.out.print(" ");
            System.out.println(apeCant.cantidad);
        }
    }
}
