package edu.it;

import edu.it.components.ConectorJPA;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Curso JPA");
        var conn = new ConectorJPA();
        var em = conn.getEntityManager();
        em.close();
    }
}
