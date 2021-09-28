package edu.it.components;

import javax.persistence.*;

public class ConectorJPA {
    private EntityManager em;

    public ConectorJPA() {
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("mariadb");

        em = emf.createEntityManager();
    }
    public EntityManager getEntityManager() {
        return em;
    }
}
