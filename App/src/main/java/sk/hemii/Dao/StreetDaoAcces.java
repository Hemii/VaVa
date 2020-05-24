package sk.hemii.Dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sk.hemii.Models.Vybava_street;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StreetDaoAcces implements StreetDao {
    Logger streetDaoAcces = LoggerFactory.getLogger(StreetDaoAcces.class);


    @Override
    public int insert(Vybava_street vybava_street) {
        int id=0;
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hemii");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            entityManager.getTransaction().begin();
            entityManager.persist(vybava_street);
            entityManager.flush();
            id = vybava_street.get_id();
            entityManager.getTransaction().commit();
        } finally {
            if (!entityManager.getTransaction().isActive())
                try {
                    entityManager.getTransaction().rollback();
                } catch (Exception ignored) {
                    streetDaoAcces.info("Successfuly inserted race: " + id);
                }
            entityManager.close();


        }
        return id;
    }


}
