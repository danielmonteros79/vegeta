package edu.it;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import edu.it.ejemplos.InsertarDatos;
import edu.it.ejemplos.PruebaQuery;

@Component
public class SegundoMain implements CommandLineRunner {
    private InsertarDatos insertarDatos;

    @Autowired
    PruebaQuery pruebaQuery;
    
    public SegundoMain(InsertarDatos insertarDatos) {
        this.insertarDatos = insertarDatos;
    }

    public void run(String... args) throws Exception {
    	pruebaQuery.run();
    }
}
