package edu.it.utiles;

import java.util.UUID;

public class Util {
    public static String newId() {
        return UUID.randomUUID().toString();
    }
    public static void esperar(int cantSegundos) {
        try {
            Thread.sleep(cantSegundos * 1000);
        }
        catch (Exception ex) {
        }
    }
}
