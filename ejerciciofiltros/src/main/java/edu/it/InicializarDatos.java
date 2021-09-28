package edu.it;

import java.util.ArrayList;

public class InicializarDatos implements Runnable {
    public void run() {
        ArrayList<Chofer> choferes = new ArrayList<Chofer>();

        Chofer chofer1 = new Chofer( "fernando", true, 2 );
        choferes.add( chofer1);
        Chofer chofer2 = new Chofer( "martin", false, 5 );
        choferes.add( chofer2);
        Chofer chofer3 = new Chofer( "juan", true, 0 );
        choferes.add( chofer3);
        Chofer chofer4 = new Chofer( "pedro", false, 0 );
        choferes.add( chofer4);

        Filtros filtro = new Filtros();
        System.out.println("");
        for (Chofer c : filtro.obtenerChoferLeGustaSuTrabajoConAccidentes(choferes)) {
            System.out.println(c);
        }
        System.out.println("************************");
        for (Chofer c : filtro.obtenerChoferLeGustaSuTrabajoSinAccidentes(choferes)) {
            System.out.println(c);
        }
        System.out.println("************************");
        for (Chofer c : filtro.obtenerChoferNOGustaSuTrabajoConAccidentes(choferes)) {
            System.out.println(c);
        }
        System.out.println("************************");
        for (Chofer c : filtro.obtenerChoferNOGustaSuTrabajoSinAccidentes(choferes)) {
            System.out.println(c);
        }

        System.out.println("************************");
        System.out.println("************************");

        choferes
                .stream()
                .limit(10)
                .filter(c -> (c.leGustaSuTrabajo))
                .filter(c -> (c.nombre.length() < 9))
                .forEach(c -> {
                    System.out.println("==================");
                    System.out.println(c.nombre);
                    System.out.println(c.leGustaSuTrabajo);
                    System.out.println("==================");
                });
    }
}
