package edu.it.ejemplos;

import edu.it.components.ConectorJPA;
import edu.it.entities.TipoDeUsuario;
import edu.it.entities.Usuario;

public class EjemploQueryServerSide implements Runnable {
    public void run() {
        var conn = new ConectorJPA();
        var em = conn.getEntityManager();

        var JPQL = "SELECT u FROM Usuario u WHERE apellido = :apeParam and tipoDeUsuario = :tipoUsuParam ";
        var usuQuery = em.createQuery(JPQL, Usuario.class);
        usuQuery.setParameter("apeParam", "Parker");
        usuQuery.setParameter("tipoUsuParam", TipoDeUsuario.USUARIO_ROOT);

        var listaUsu = usuQuery.getResultList();

        for (Usuario u : listaUsu) {
            System.out.println(u.toString());
        }
    }
}
