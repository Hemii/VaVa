package sk.hemii.Dao;

import sk.hemii.Models.Prihlasenie;
import sk.hemii.Models.Sekcia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class SecDaoAcces implements SecDao {

    @Override
    public List<Integer> insert(int pocet, Prihlasenie prihlasenie) {
        List<Integer> id_sekcii = new ArrayList<Integer>();
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hemii");
        EntityManager entityManager = entityManagerFactory.createEntityManager();



        for (int i = 1; i <= pocet; i++){
            entityManager.getTransaction().begin();
            Sekcia sekcia = new Sekcia();
            sekcia.set_body(0);
            sekcia.set_sekcia(i);
            sekcia.set_cas_min(0);
            sekcia.set_cas_sek(0);
            sekcia.set_prihlasenie(prihlasenie);
            entityManager.persist(sekcia);
            entityManager.flush();

            id_sekcii.add(sekcia.get_id());
            entityManager.getTransaction().commit();
        }


        return id_sekcii;
    }

    @Override
    public void update(Sekcia sekcia_values) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hemii");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        Sekcia sekcia = entityManager.find(Sekcia.class, sekcia_values.get_id());
        sekcia.set_cas_sek(sekcia_values.get_cas_sek());
        sekcia.set_cas_min(sekcia_values.get_cas_min());
        sekcia.set_body(sekcia_values.get_body());

        entityManager.getTransaction().commit();
    }

    public List<Sekcia> select(int values) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hemii");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        List<Sekcia> sekcia = (List<Sekcia>) entityManager.createQuery("FROM Sekcia p where p._prihlasenie.id = (:param)" , Sekcia.class).setParameter("param", values).getResultList();

        entityManager.getTransaction().commit();
        return sekcia;

    }
}
