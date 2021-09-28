package edu.it.ejemplos;

import edu.it.components.ConectorJPA;
import edu.it.entities.TipoDeUsuario;
import edu.it.entities.Usuario;
import static edu.it.utiles.Util.newId;

public class EjemploInsercion implements Runnable {
    public void run() {
        var conn = new ConectorJPA();
        var em = conn.getEntityManager();

        var usu = new Usuario();
        usu.id = newId();
        usu.nombre = "Eugenia";
        usu.apellido = "Saraccio";
        usu.domicilio = "Esmeralda 223";
        usu.pais = "Kongo";
        usu.tipoDeUsuario = TipoDeUsuario.USUARIO_ESTANDAR;

        var tx = em.getTransaction();
        tx.begin();
        em.persist(usu);
        tx.commit();

        em.close();
    }
}
