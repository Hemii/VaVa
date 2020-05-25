package sk.hemii;

import sk.hemii.Models.Pretekar;
import sk.hemii.Models.Prihlasenie;
import sk.hemii.Models.Sutaz;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;
import java.util.logging.Logger;

public class Functions {


    public static void Push_to_table(Sutaz sutaz) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hemii");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            entityManager.getTransaction().begin();
            entityManager.persist(sutaz);
            entityManager.getTransaction().commit();
        } finally {
            if (!entityManager.getTransaction().isActive())
                try {
                    entityManager.getTransaction().rollback();
                } catch (Exception ignored) {
//                log.warn("Ignored rollback error", ignored);
                }
            entityManager.close();


        }

    }
}