package edu.it;

import edu.it.ejemplos.InsertarActor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SegundoMain implements CommandLineRunner {
    private InsertarActor insertarActor;

    public SegundoMain(InsertarActor insertarActor) {
        this.insertarActor = insertarActor;
    }

    public void run(String... args) throws Exception {
        insertarActor.run();
    }
}
