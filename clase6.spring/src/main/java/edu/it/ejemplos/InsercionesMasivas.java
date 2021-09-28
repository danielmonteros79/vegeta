package edu.it.ejemplos;

import edu.it.entities.Usuario;
import edu.it.repository.UsuarioRepository;
import static edu.it.utiles.Util.inventarUsuario;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsercionesMasivas implements Runnable {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Transactional
    public void run() {
        System.out.println("Voy a realizar inserciones masivas");

        for (int x : new int[3]) {
            Usuario u = inventarUsuario();
            System.out.println(u.nombre);
            u.id = "000c95f0-e494-44d2-836d-f756b5a02032";
            usuarioRepository.save(u);
        }
    }
}
