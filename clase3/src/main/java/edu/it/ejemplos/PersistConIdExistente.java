package edu.it.ejemplos;

import edu.it.components.ConectorJPA;
import edu.it.entities.TipoDeUsuario;
import edu.it.entities.Usuario;

public class PersistConIdExistente implements Runnable {

    @Override
    public void run() {
        var conn = new ConectorJPA();
        var em = conn.getEntityManager();

        var usu = new Usuario();
        usu.id = "001385a8-8c44-4eb0-85d2-a57c5e840711";
        usu.nombre = "Eugenia";
        usu.apellido = "Saraccio";
        usu.domicilio = "Esmeralda 223";
        usu.pais = "Kongo";
        usu.tipoDeUsuario = TipoDeUsuario.USUARIO_ESTANDAR;

        var tx = em.getTransaction();
        tx.begin();
        em.merge(usu);
        tx.commit();

        em.close();
    }
}
