package sk.hemii.Dao;

import sk.hemii.Models.Vysledok;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class ResultDaoAcces implements ResultDao {

    @Override
    public void insert(Vysledok Vysledok) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hemii");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(Vysledok);
        entityManager.getTransaction().commit();
    }

    public List<Vysledok> select(int values) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hemii");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        List<Vysledok> vysledok = (List<Vysledok>) entityManager.createQuery("FROM Vysledok p where p._sutaz_id = (:param)" , Vysledok.class).setParameter("param", values).getResultList();

        entityManager.getTransaction().commit();
        return  vysledok;
    }

    public void remove(int values){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hemii");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Vysledok vysledok = entityManager.find(Vysledok.class,values);
        entityManager.remove(vysledok);
        entityManager.getTransaction().commit();
    }

}
