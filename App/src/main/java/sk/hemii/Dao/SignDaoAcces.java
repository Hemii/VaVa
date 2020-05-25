package sk.hemii.Dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sk.hemii.Models.Prihlasenie;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class SignDaoAcces implements SignDao {
    Logger signDAOLogger = LoggerFactory.getLogger(SignDaoAcces.class);

    @Override
    public int insert(Prihlasenie prihlasenie) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hemii");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        int id=0;
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(prihlasenie);
            entityManager.flush();
            id = prihlasenie.get_id();
            entityManager.getTransaction().commit();
        } finally {
            if (!entityManager.getTransaction().isActive())
                try {
                    entityManager.getTransaction().rollback();
                } catch (Exception ignored) {
                    signDAOLogger.info("Successfuly inserted sign: " + id);
                }
            entityManager.close();


        }
        return id;
    }

    public List<Prihlasenie> select(int values) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hemii");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        List<Prihlasenie> prihlasenia = (List<Prihlasenie>) entityManager.createQuery("FROM Prihlasenie p where p._sutaz.id = (:param)" , Prihlasenie.class).setParameter("param", values).getResultList();

        entityManager.getTransaction().commit();
        return  prihlasenia;



    }
}
