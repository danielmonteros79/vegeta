package edu.it;

import org.apache.log4j.Logger;

public class App {
    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getLogger(App.class);

        logger.trace("Este es trace");
        logger.debug("Este es el debug");
        logger.info("Este es el info");
        logger.warn("Este es el warn");
        logger.error("Este es el error");

        System.out.println("Curso JPA");

        Runnable r = (Runnable)Class
                .forName("edu.it.ejemplos.UnoAMuchosEjemplo2")
                .getConstructor()
                .newInstance();

        r.run();
    }
}
