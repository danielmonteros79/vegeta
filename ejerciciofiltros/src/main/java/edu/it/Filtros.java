package edu.it;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Filtros {

    private List<Chofer> filtroGenerico(List<Chofer> choferes, Predicate<Chofer> predChoffer) {
        List<Chofer> list = new ArrayList<Chofer>();
        for (int i = 0; i < choferes.size(); i++) {
            if (predChoffer.test(choferes.get(i))) {
                list.add(choferes.get(i));
            }
        }
        return list;
    }

    public List<Chofer> obtenerChoferLeGustaSuTrabajoSinAccidentes(List<Chofer> choferes) {
        Predicate<Chofer> pred = c -> ((c.leGustaSuTrabajo) && (c.cantidadDeAccidentes == 0));
        return filtroGenerico(choferes, pred);
    }

    public List<Chofer> obtenerChoferLeGustaSuTrabajoConAccidentes(List<Chofer> choferes) {
        Predicate<Chofer> pred = c -> ((c.leGustaSuTrabajo) && (c.cantidadDeAccidentes > 0));
        return filtroGenerico(choferes, pred);
    }

    public List<Chofer> obtenerChoferNOGustaSuTrabajoSinAccidentes(List<Chofer> choferes) {
        Predicate<Chofer> pred = c -> ((c.leGustaSuTrabajo == false) && (c.cantidadDeAccidentes == 0));
        return filtroGenerico(choferes, pred);
    }

    public List<Chofer> obtenerChoferNOGustaSuTrabajoConAccidentes(List<Chofer> choferes) {
        Predicate<Chofer> pred = c -> ((c.leGustaSuTrabajo == false) && (c.cantidadDeAccidentes > 0));
        return filtroGenerico(choferes, pred);
    }
}
