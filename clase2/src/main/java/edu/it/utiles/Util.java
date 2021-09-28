package edu.it.utiles;

import com.github.javafaker.Faker;
import edu.it.entities.TipoDeUsuario;
import edu.it.entities.Usuario;
import java.util.Random;
import java.util.UUID;

public class Util {
    public static String newId() {
        return UUID.randomUUID().toString();
    }
    public static Usuario inventarUsuario() {
        Usuario usu = new Usuario();

        var fkr = new Faker();
        var domicilio = String.join(" ",
                    fkr.address().streetName(),
                    fkr.address().streetAddressNumber()
                    );

        usu.id = newId();
        usu.nombre = fkr.address().firstName();
        usu.apellido = fkr.address().lastName();
        usu.domicilio = domicilio;
        usu.pais = fkr.address().country();
        usu.tipoDeUsuario = (new Random().nextInt() % 2 == 0) ?
                    TipoDeUsuario.USUARIO_ESTANDAR :
                    TipoDeUsuario.USUARIO_ROOT;

        return usu;
    }
}
