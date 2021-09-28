package edu.it;

import edu.it.ejemplos.InsercionesMasivas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SegundoMain implements CommandLineRunner {

    @Autowired
    InsercionesMasivas insercionesMasivas;

    public void run(String... args) throws Exception {
        insercionesMasivas.run();
    }
}
