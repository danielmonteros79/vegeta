package edu.it;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Curso JPA");

        Runnable r = (Runnable)Class
                .forName("edu.it.ejemplos.EjemploAgruparPorApellido")
                .getConstructor()
                .newInstance();

        r.run();
    }
}
