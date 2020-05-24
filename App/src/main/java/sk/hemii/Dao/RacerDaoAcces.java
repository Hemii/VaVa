package sk.hemii.Dao;

import sk.hemii.Models.Pretekar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class RacerDaoAcces implements RacerDao {
    @Override
    public List<Pretekar> loadall() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hemii");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        List<Pretekar> pretekar = entityManager.createQuery("FROM Pretekar", Pretekar.class).getResultList();

        entityManager.getTransaction().commit();
        return pretekar;
    }

    public Pretekar select(int values) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hemii");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Pretekar pretekar = (sk.hemii.Models.Pretekar) entityManager.createQuery("FROM Pretekar p where p.id = (:param)" , Pretekar.class).setParameter("param", values).getSingleResult();

        entityManager.getTransaction().commit();
        return pretekar;
    }

}
