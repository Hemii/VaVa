package sk.hemii.Dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sk.hemii.Models.Sutaz;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;


public class RaceDaoAcces implements RaceDao {

    private Sutaz _sutaz;
    Logger raceDAOLogger = LoggerFactory.getLogger(RaceDaoAcces.class);

    @Override
    public int inser(Sutaz sutaz) {
        int id;
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hemii");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            entityManager.getTransaction().begin();
            entityManager.persist(sutaz);
            entityManager.flush();
            id = sutaz.get_id();
            entityManager.getTransaction().commit();
        } finally {
            if (!entityManager.getTransaction().isActive())
                try {
                    entityManager.getTransaction().rollback();
                } catch (Exception ignored) {
                    raceDAOLogger.info("Successfuly inserted race: " + sutaz.get_miesto());
                }
            entityManager.close();


        }
        return id;
    }

    @Override
    public List<Sutaz> select() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hemii");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        List<Sutaz> sutaze = entityManager.createQuery("FROM Sutaz ", Sutaz.class).getResultList();

        entityManager.getTransaction().commit();
        return sutaze;
    }

    @Override
    public void remove(int id) {

    }

    @Override
    public void save(Sutaz sutaz) {
        this._sutaz=sutaz;

    }
    public Sutaz load(){
        return this._sutaz;
    }

    public Sutaz get_sutaz() {
        return _sutaz;
    }

    public void set_sutaz(Sutaz _sutaz) {
        this._sutaz = _sutaz;
    }
}

