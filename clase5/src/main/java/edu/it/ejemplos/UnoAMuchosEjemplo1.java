package edu.it.ejemplos;

import edu.it.components.ConectorJPA;
import edu.it.entities.Director;
import edu.it.entities.Pelicula;

public class UnoAMuchosEjemplo1 implements Runnable {
    public void run() {
        var conn = new ConectorJPA();
        var em = conn.getEntityManager();

        Director kubrick = new Director("200000001", "Stanley Kubrick");
        Director almodovar = new Director("200000002", "Pedor Almodovar");
        Director pineiro = new Director("200000003", "Marcelo Pyneiro");
        Director rodrigoGrande = new Director("200000004", "Rodrigo Grande");
        Director ethanCohen = new Director("200000005", "Hermanos Cohen");

        Pelicula volver = new Pelicula("100000001", "Volver", "drama", almodovar);
        Pelicula doloryGloria = new Pelicula("100000002", "Dolor y Gloria", "drama", almodovar);

        Pelicula elResplandor = new Pelicula("100000003", "El resplandor", "suspenso", kubrick);

        Pelicula barryLindon = new Pelicula("100000004", "Barry Lyndon", "drama", kubrick);
        Pelicula plataQuemada = new Pelicula("100000005", "Plata quemada","Drama", pineiro);
        Pelicula alFinalDelTunnel = new Pelicula("100000006", "Al final del tunnel","Suspenso", rodrigoGrande);
        Pelicula elMetodo = new Pelicula("100000007", "El metodo", "Suspenso", pineiro);
        Pelicula noCountryForOldMen = new Pelicula("100000008", "No Country for Old Men", "Suspenso", ethanCohen);
        Pelicula serieMarceloPin = new Pelicula("100000009", "El reino", "Ficcion", kubrick);

        pineiro.agregarPelicula(serieMarceloPin);

        var tx = em.getTransaction();
        tx.begin();
        em.merge(pineiro);
        tx.commit();
    }
}
